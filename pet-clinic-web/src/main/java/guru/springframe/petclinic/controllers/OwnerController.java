package guru.springframe.petclinic.controllers;

import guru.springframe.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/owners")
@Controller
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }


    @RequestMapping({"","/index","/index.html"})
    public String listOwners(Model model){//spring mvc会自动地加入一个model
        model.addAttribute("owners", ownerService.findAll());//findall()返回一个set去迭代over

        return "owners/index";
    }
}
