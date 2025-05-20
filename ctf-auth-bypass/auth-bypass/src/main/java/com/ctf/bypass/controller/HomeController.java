package com.ctf.bypass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("message", "Welcome to the Admin Page!");
        return "admin";
    }

    @GetMapping("/admin/flag")
    public String flagPage(Model model) {
        model.addAttribute("flag", "CTF{spring_security_regex_bypass}");
        return "flag";
    }
}