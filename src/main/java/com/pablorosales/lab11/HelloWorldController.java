package com.pablorosales.lab11;
//This allows thymeleaf I think
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//This for using the annotation @RestController:
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @RequestMapping("/")
  public String helloWorld(){
    return "Hello World!";
  }

}
