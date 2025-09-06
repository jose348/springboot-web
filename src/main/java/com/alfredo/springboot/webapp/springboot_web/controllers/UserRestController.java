package com.alfredo.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import com.alfredo.springboot.webapp.springboot_web.models.User;
import com.alfredo.springboot.webapp.springboot_web.models.Dto.UserDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // para decirle a los metodos handler que los convierta en handlers REST
@RequestMapping("/api") //ruta raiz para todos los endpoints de este controlador
public class UserRestController {
    // HANDLERS ES UN METODO QUE RESPONDE A UNA PETICION HTTP

    @GetMapping("/details2")
    public UserDto details() {

        User user = new User("Alfredo", "Fiestas");
        UserDto userDto=new UserDto();
        userDto.setUser(user);
        userDto.setTitulo("Bienvenido al Mundo Spring Framework con Thymeleaf esto sale con Dto, Objeto de Transferencia de Datos");

        return userDto;
        }

    @GetMapping("/details2-map")
    //@ResponseBody //indica que el valor devuelto por el metodo sera el cuerpo de la respuesta HTTP, respuesta tipo JSON o XML 
    public Map<String, Object> detailsMap() {

        User user = new User("Alfredo", "Fiestas");
         Map<String, Object> body =new HashMap<>();
         body.put("title", "Bienvenido al Mundo Spring Framework con Thymeleaf");
            body.put("user", user);
            return body;
        }
    }