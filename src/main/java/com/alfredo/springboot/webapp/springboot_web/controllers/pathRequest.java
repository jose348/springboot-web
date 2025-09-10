package com.alfredo.springboot.webapp.springboot_web.controllers;

import com.alfredo.springboot.webapp.springboot_web.models.Dto.ParamDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
   @RequestMapping("/api/var")
public class pathRequest {

      @GetMapping("/baz/{message}")
      //@PathVariable para enviar por ruta y multiples párametros
      public ParamDto baz(@PathVariable String message){
         ParamDto pd=new ParamDto();
         pd.setMessage(message);
         return pd;
      }

      @GetMapping("/mix/{product}/{id}")
       public Map<String, Object> mixPath(@PathVariable String product, @PathVariable Long id){
            Map<String, Object> json=new HashMap<>();
            json.put("product", product);
            json.put("id",id);
         return json;
      }
}