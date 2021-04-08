package com.example.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("")
    public String getIndex(@RequestParam(required = false) String name, Model model){

        if(name == null || name.isBlank()) {
            name = "World";
        }
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/details")
    public String getDetails(){
        return "details";
    }
}
