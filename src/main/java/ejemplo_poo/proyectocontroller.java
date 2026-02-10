package ejemplo_poo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class proyectocontroller {
    @RequestMapping("/")
    public String proyecto() {
        return "hola mundo";
    }
}
