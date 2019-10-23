package com.gekif.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// Controller
@RestController
public class HelloWorldController {



    @RequestMapping(
            // GET
            method = RequestMethod.GET,

            // URI - /hello-world
            path = "/hello-world")
    public String helloWorld() {

        // method - "Hello World"
        return "Hello World";
    }


    /*
     Another Version
     @GetMapping(path = "/hello-world")
     public String helloWorld() {
        return "Hello World";
     }
     */
}
