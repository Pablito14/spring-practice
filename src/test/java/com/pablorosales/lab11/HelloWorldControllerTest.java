package com.pablorosales.lab11;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldControllerTest {

  @Test
  public void testHelloWorld() {
    assertEquals("This method should just return: Hello world!", "Hello world!", HelloWorldController.helloWorld());
  }
}