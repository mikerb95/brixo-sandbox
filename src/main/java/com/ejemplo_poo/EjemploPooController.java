package com.ejemplo_poo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EjemploPooController {
    @GetMapping("/proyecto")
    public String proyecto(){
        return "Proyecto Ejemplo POO";
    
}
