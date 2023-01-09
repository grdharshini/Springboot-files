package com.dharshinicodes.SpringSecurityDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String Home(){
        return "This is Home Page";
    }

    @GetMapping("/admin")
    public String Admin(){
        return "This is Admin page";
    }
}
