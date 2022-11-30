package com.solera.rubiogoncalves.airlinesapp.webTestExamples;


import static org.assertj.core.api.Assertions.assertThat;

import com.solera.rubiogoncalves.airlinesapp.examples.HomeController;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Before any specific test, it may be convenient to do some sanity checks,
 * so we don't lose time checking something that we know beforehand will not
 * work.
 *
 * Spring interprets the @Autowired annotation,
 * and the controller is injected before the test methods are run.
 * We use AssertJ (which provides assertThat() and other methods) to
 * express the test assertions.
 */
@SpringBootTest
public class SmokeTest {

	@Autowired
	private HomeController controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
}
