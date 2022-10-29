package com.shipley.app.ac.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ACControllers {

    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome";
    }
}
