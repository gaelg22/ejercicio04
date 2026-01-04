package com.upiiz.heroes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String redirectToHeroes() {
        // Redirige a /marvel/socios/v1/heroes
        return "redirect:/marvel/socios/v1/heroes";
    }
}