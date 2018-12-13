package com.pablorosales.lab11;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CapitalizeController {

  @RequestMapping(value="/capitalize/{input}", method= RequestMethod.GET)
  public String capitalize(@PathVariable()String input) {
    return capitalizeString(input);
  }
  // Logic for methods:

  public static String capitalizeString(String stringToCapitalize){
    return stringToCapitalize.toUpperCase();
  }

}
