package geekdisplaced.learning.geekpetclinic.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnersController {

    @RequestMapping({ "","/", "/index", "/index.html" })
    public String index(){

        return "owners/index";
    }
}