package proyecto_cl.proyecto_clase0;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Proyectocontroller {
    @GetMapping("/proyecto")
    public String proyecto(){
        return "Proyecto Ejemplo POO";
    
}
