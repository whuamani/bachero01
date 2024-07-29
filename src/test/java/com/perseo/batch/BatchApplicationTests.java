package com.perseo.batch;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BatchApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testConcatenate()
	{

		String result = "saludo";
		assertEquals("saludo", result);
	}

}
