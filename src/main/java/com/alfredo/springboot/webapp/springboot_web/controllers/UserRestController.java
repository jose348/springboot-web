package com.alfredo.springboot.webapp.springboot_web.controllers;

import java.util.*;

import com.alfredo.springboot.webapp.springboot_web.models.Dto.UserDto;
import com.alfredo.springboot.webapp.springboot_web.models.User;

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

        User user = new User("Alfredo", "Fiestas","askdjf@asdf5a2");
        UserDto userDto=new UserDto();
        userDto.setUser(user);
        userDto.setTitulo("Spring Framework con Thymeleaf esto sale con Dto, Objeto de Transferencia de Datos");

        return userDto;
    }

    @GetMapping("listUser")
    public List<User> lista(){
        User u=new User("Jose","Fiestas","as@asd");
        User u1=new User("Mario","Fiestas", "asas@213");
        User u2=new User("Veronica","Fiestas","dwda5@654");
        User u3=new User("Liam","Fiestas","454@as231");

       //List<User> users=new ArrayList<>();
        //users.add(u);
        //users.add(u1);
        //users.add(u2);
        //return users;
// *** AHORA PODEMOS UTILIZAR UN ATAJO, CON LO HELPERS
        List<User> listaHelpers = Arrays.asList(u, u1,u2,u3);
        return listaHelpers;

    }

    @GetMapping("/details2-map")
    //@ResponseBody //indica que el valor devuelto por el metodo sera el cuerpo de la respuesta HTTP, respuesta tipo JSON o XML 
    public Map<String, Object> detailsMap() {

        User user = new User("Alfredo", "Fiestas","sdf@sdfsd");
         Map<String, Object> body =new HashMap<>();
         body.put("title", "Bienvenido al Mundo Spring Framework con Thymeleaf");
            body.put("user", user);
            return body;
        }
    }