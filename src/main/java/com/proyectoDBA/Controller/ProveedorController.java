
package com.proyectoDBA.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/proveedor")
public class ProveedorController {
    @GetMapping("/main")
    public String mostrarMainProveedor() {
        return "proveedor/main"; 
    }
    
    @GetMapping("/registro")
    public String registrarProveedor() {
        return "proveedor/registro"; 
    }
}
