package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //la clase se vuelve de tipo controlador
public class IndexController {
    //metodo de accion o handler
    @GetMapping(value="/")
    public String index(){
        return "index";
    }
}
