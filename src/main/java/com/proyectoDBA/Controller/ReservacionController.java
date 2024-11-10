
package com.proyectoDBA.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reservacion")
public class ReservacionController {

    @GetMapping("/main")
    public String mostrarMainReserva() {
        return "reservacion/main"; 
    }
    
    @GetMapping("/registro")
    public String registrarReserva() {
        return "reservacion/registro"; 
    }
    
    @PostMapping("/confirmacion")
    public String confirmarReserva() {
        return "reservacion/confirmacion"; 
    }
}