package com.pablorosales.lab11;
//import org.springframework.stereotype.Controller; //This allows thymeleaf templeting
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam; //Not entirely sure of this import, but better safe than sorry.
import org.springframework.web.bind.annotation.RestController; //This for using the annotation @RestController:

@RestController
public class HelloWorldController {

  @RequestMapping(value="/hello", method=RequestMethod.GET)
  public static String helloWorld() {
    return "Hello world!";
  }


}
