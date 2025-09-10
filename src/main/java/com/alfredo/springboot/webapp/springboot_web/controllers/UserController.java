package com.alfredo.springboot.webapp.springboot_web.controllers;


import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.alfredo.springboot.webapp.springboot_web.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller // para decir que es un controlador de Spring
public class UserController {
    // HANDLERS ES UN METODO QUE RESPONDE A UNA PETICION HTTP

    @GetMapping("/details")
    public String details(Model model) {
        User user=new User("Jose","Alfredo");
        user.setEmail("Jfiestas650@gmail.com");
        model.addAttribute("title", "Bienvenido al Mundo Spring Framework con Thymeleaf");
        model.addAttribute("user",user);
        return "details";
       //public String detail(Map<String, Object> modelo){
        //modelo.put("title", "Bienvenido al Mundo Spring Framework con Thymeleaf");
        //modelo.put("name","Alfredo");
        //modelo.put("lastname","Fiestas");
        //return "details";
        }
        @GetMapping("/list")
        public String list(ModelMap modelo){
        List<User> users=Arrays.asList(new User("Jose", "Alfredo"),
                new User("Mario", "JosyMar","Jfiestas650@gmail.com"),
            new User("Veronica", "Fiestas","thegirl@gmail.com"));
        modelo.addAttribute("users",users);
        modelo.addAttribute("title", "Validando con IF, listado de Usuarios");
        return "list";
        }

    }