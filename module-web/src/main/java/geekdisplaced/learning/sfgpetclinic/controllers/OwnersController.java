package geekdisplaced.learning.sfgpetclinic.controllers;

import geekdisplaced.learning.sfgpetclinic.data.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnersController {

    private final OwnerService ownerService;

    public OwnersController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({ "","/", "/index", "/index.html" })
    public String listOwners(Model model){

        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }

    @RequestMapping({ "/find" })
    public String findOwners(Model model){

        return "notimplemented";
    }
}
