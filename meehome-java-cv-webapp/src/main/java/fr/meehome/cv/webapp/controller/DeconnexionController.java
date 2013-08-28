package fr.meehome.cv.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.meehome.cv.webapp.model.User;
 
@Controller
@RequestMapping("/deconnexion")
public class DeconnexionController {

    @RequestMapping(method = RequestMethod.GET)
    public String accueil(ModelMap model) {
        model.addAttribute("userAuthentificated", new User());
        return "redirect:accueil/"; 
    }
}
