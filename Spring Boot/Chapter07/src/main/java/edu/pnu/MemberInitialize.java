package edu.pnu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import edu.pnu.config.domain.Member;
import edu.pnu.persistence.MemberRepository;

@Component
public class MemberInitialize implements ApplicationRunner {
	
	@Autowired
	MemberRepository memRepo;

	@Autowired
	BCryptPasswordEncoder encoder;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		memRepo.save(Member.builder()
				.username("member")
				.password(encoder.encode("abcd"))
				.role("MEMBER")
				.enabled(true)
				.build());
		
		memRepo.save(Member.builder()
				.username("manager")
				.password(encoder.encode("abcd"))
				.role("MANAGER")
				.enabled(true)
				.build());
		
		memRepo.save(Member.builder()
				.username("admin")
				.password(encoder.encode("abcd"))
				.role("ADMIN")
				.enabled(true)
				.build());

	}

}
