package com.upiiz.heroes.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("/")
    public String redirect() {
        return "Redirige a /marvel/socios/v1/heroes para ver los datos";
    }
}
