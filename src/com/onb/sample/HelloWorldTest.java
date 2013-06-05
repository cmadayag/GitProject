package com.onb.sample;

import static org.junit.Assert.*;
import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testHelloWorld() {
		HelloWorld helloWorld = new HelloWorld();
		assertEquals("Hello world", helloWorld.saySomeHello());
	}

}
