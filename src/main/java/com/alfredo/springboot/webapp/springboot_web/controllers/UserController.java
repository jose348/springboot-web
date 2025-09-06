package com.alfredo.springboot.webapp.springboot_web.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller // para decir que es un controlador de Spring
public class UserController {
    // HANDLERS ES UN METODO QUE RESPONDE A UNA PETICION HTTP

    @GetMapping("/details")
    //public String details(Model model) {
       // model.addAttribute("title", "Bienvenido al Mundo Spring Framework con Thymeleaf");
       // model.addAttribute("name", "Alfredo");
       // model.addAttribute("lastname", "Fiestas");
       // return "details";
       public String detail(Map<String, Object> modelo){
        modelo.put("title", "Bienvenido al Mundo Spring Framework con Thymeleaf");
        modelo.put("name","Alfredo");
        modelo.put("lastname","Fiestas");
        return "details";    
        }

    @GetMapping("/list")
    public String list(Map<String, Object> lista){
        List<String> users= List.of("Jose","Alfredo","Juan","Ana","Marta");
        lista.put("users", users);
        return "details";
    }    

    }