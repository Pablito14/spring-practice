package com.pablorosales.lab11;
import org.springframework.stereotype.Controller; //This allows thymeleaf templeting
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController; //This for using the annotation @RestController:

@Controller
public class HelloWorldController {

  @RequestMapping("/hello")
  public String helloWorld(){
    return "Hello World!";
  }

  @RequestMapping(value="/capitalize/${String}", method= RequestMethod.GET)
  public String capitalize(@PathVariable()String string){
    return capitalizeString(string);
  }

  public String capitalizeString(String stringToCapitalize){
    return stringToCapitalize.toUpperCase();
  }

}
