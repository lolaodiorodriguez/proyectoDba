
package com.proyectoDBA.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @GetMapping("/main")
    public String mostrarMainHotel() {
        return "cliente/main"; 
    }
}