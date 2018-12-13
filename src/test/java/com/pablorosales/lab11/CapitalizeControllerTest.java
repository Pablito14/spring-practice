package com.pablorosales.lab11;

import org.junit.Test;

import static org.junit.Assert.*;

public class CapitalizeControllerTest {

  @Test
  public void testCapitalizeString() {

    assertEquals("this should all be capitalized", "THIS SHOULD ALL BE CAPITALIZED", CapitalizeController.capitalizeString("this should all be capitalized"));

    assertEquals("this should all be capitalized: ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ABCDEFGHIJKLMNOPQRSTUVWXYZ", CapitalizeController.capitalizeString("abcdefghijklmnopqrstuvwxyz"));

    assertEquals("this should all be capitalized: Cada vez que trabajo, Felix me paga un whisky", "CADA VEZ QUE TRABAJO, FELIX ME PAGA UN WHISKY", CapitalizeController.capitalizeString("Cada vez que trabajo, Felix me paga un whisky"));
  }
}