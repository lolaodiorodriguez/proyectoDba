
package com.proyectoDBA.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @PostMapping
    public String login() {
        return "redirect:/principal/principal"; // Redirige a principal/principal.html
    }
}