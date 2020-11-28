package com.marcuschiu.profileandactiveprofileexample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("prod")
class ProfileAndActiveProfileExampleApplicationTests {

	@Test
	void contextLoads() {
	}

}
