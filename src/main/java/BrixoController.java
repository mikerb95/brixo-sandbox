package brixo.c1;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@restController
public class BrixoController {
@mapping("/proyecto")
public String proyecto(){
    return "Proyecto Brixo";
    
}
