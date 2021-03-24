package com.example.demo.student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
* El RestController  tells Spring that this code describes an endpoint
* that should be made available over the web. Es decir, le dice al framework
* que describe un punto final disponible para la web
*
* */
@RestController
public class StudentController {

    //GetMapping mapea aquellos GET request.
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}
