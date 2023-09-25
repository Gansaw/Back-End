package edu.pnu;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

//@SpringBootTest
// MockMvc라는 객체가 만들어져서 자동으로 container에 올라가있음
@WebMvcTest
class Chapter3ApplicationTests {

	//MockMvc 주소를 할당해줌(참조변수)
	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void testHello() throws Exception {
		mockMvc.perform(get("/hello").param("name","둘리"))
		.andExpect(status().isOk())
//		.andExpect(content().string("Hello : 둘리"))
		.andDo(print());
	}

}
