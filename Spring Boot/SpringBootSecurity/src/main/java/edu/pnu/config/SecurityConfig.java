package edu.pnu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@EnableWebSecurity
@Configuration
public class SecurityConfig {	
	
	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		http.csrf(csrf -> csrf.disable());
		http.cors(cors -> cors.disable());		
		
		http.authorizeHttpRequests(security -> {
			security.requestMatchers("/member/**").authenticated()
					.requestMatchers("/manager/**").hasAnyRole("MANAGER","ADMIN")
					.requestMatchers("/admin/**").hasRole("ADMIN")
					.anyRequest().permitAll();			
		});
		
		http.formLogin(frmLogin -> {
			frmLogin.loginPage("/login")
			.defaultSuccessUrl("/loginSuccess", true);
		});
		
		http.oauth2Login(oauth2->{
			oauth2.loginPage("/login");
		});

		
		http.exceptionHandling(ex -> ex.accessDeniedPage("/accessDenied"));
		http.logout(logt -> {
			logt.invalidateHttpSession(true)
			.deleteCookies("JSESSIONID")
			.logoutSuccessUrl("/login");
		});
		
				
		return http.build();
	}
	
	@Controller
	public class SecurityController{		
		@GetMapping("/member")
		public void forMember() {
			System.out.println("Member 요청입니다.");
		}
		@GetMapping("/manager")
		public void forManager() {
			System.out.println("Manager 요청입니다.");
		}
		
		@GetMapping("/admin")
		public void forAdmin() {
			System.out.println("Admin 요청입니다.");
		}
	}
	
	

}
