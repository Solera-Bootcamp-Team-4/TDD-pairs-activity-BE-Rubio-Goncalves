package com.solera.rubiogoncalves.airlinesapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AirlinesAppApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void testUserHasCredentials() {
		
		User myUser = new User(fname, sname, nation, id, age);
		
		assert(true, User.fname != "");
		assert(true, User.sname != "");
		assert(true, User.nationality != "");
		assert(true, User.id != "");
		assert(true, User.age >= 0);
		
	}
	
	@Test
	void testCarryBags() {
		double flightcost = 20.05;
		flightcost = addCarryBag(flightcost);
		if(flightcost > 20.05) assert(true);
	}

}
