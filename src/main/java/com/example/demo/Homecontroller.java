package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class Homecontroller {
    @GetMapping("/songform")
    public String loadFormPage(Model model){
        model.addAttribute("song", new song() );
        return  "songform";
    }
    @PostMapping("/songform")
    public String loadFromPage(@ModelAttribute song song, Model model){
        model.addAttribute("song",song);
        return "confirmsong";
    }
}


