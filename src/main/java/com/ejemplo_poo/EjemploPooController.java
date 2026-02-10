package com.ejemplo_poo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrixoController {
    @GetMapping("/proyecto")
    public String proyecto(){
    return "Proyecto Brixo";
    
}
