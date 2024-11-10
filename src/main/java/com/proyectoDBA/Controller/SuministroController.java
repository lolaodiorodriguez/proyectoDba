
package com.proyectoDBA.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/suministro")
public class SuministroController {
    @GetMapping("/main")
    public String mostrarMainHotel() {
        return "suministro/main"; 
    }
    
    @GetMapping("/lista")
    public String registrarHotel() {
        return "suministro/lista"; 
    }
    
    
}
