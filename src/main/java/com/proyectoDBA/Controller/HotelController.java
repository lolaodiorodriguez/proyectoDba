package com.proyectoDBA.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/hoteles")
public class HotelController {

    @GetMapping("/main")
    public String mostrarMainHotel() {
        return "hotel/main"; 
    }
    
    @GetMapping("/registro")
    public String registrarHotel() {
        return "hotel/registro"; 
    }
}