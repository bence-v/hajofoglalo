package com.hajofoglalo.controllers;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Log4j2
@Controller
public class LoginController  {

    @GetMapping("/login")
    public String getLoginPage() {
        log.warn("/logind");
        return "login";
    }

    @PostMapping("/authenticate")
    public String auth(Model model) {
        log.warn(model.toString() +" sdfsdfsdf");
        return "login";
    }
}