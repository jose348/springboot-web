package com.alfredo.springboot.webapp.springboot_web.controllers;


import com.alfredo.springboot.webapp.springboot_web.models.Dto.ParamDto;
import com.alfredo.springboot.webapp.springboot_web.models.Dto.ParamMixDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/params")
public class RequestParamController {

    //@RequestParam me permite enviar parametros por la url
    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "Hola Que Tal") String message){
        ParamDto pd=new ParamDto();
        pd.setMessage(message);
        return pd;
    }

    @GetMapping("/bar")
    public ParamMixDto var(@RequestParam() String text, @RequestParam Integer code){
        ParamMixDto pmdto=new ParamMixDto();
        pmdto.setMessage(text);
        pmdto.setCode(code);
        return pmdto;
    }

    //UTILIZAMO DE FORMA NATIVA EL ENVIO POR LA URL CON HTTPSERVLETREQUEST
    @GetMapping("/request")
    public ParamMixDto request(HttpServletRequest req){
        ParamMixDto pmix=new ParamMixDto();
        pmix.setCode(Integer.parseInt(req.getParameter("code")));
        pmix.setMessage(req.getParameter("message"));
        return pmix;

    }

}
