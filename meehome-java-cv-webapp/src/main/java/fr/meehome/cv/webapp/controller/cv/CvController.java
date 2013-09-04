package fr.meehome.cv.webapp.controller.cv;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.meehome.cv.webapp.model.Authentification;
import fr.meehome.cv.webapp.model.cv.InformationsPersonnelle;

@Controller
@RequestMapping("/cv")
public class CvController {

    @ModelAttribute("authentification")
    public Authentification getAuthentification() {
        return new Authentification();
    }

    @ModelAttribute("cv")
    public InformationsPersonnelle getinformationsPersonnelle() {
        InformationsPersonnelle informationsPersonnelle = new InformationsPersonnelle();
        return informationsPersonnelle;
    }

    /**
     * Affichage de la page d'accueil
     * 
     * @param model
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String accueil(ModelMap model) {
        model.addAttribute("cv", getinformationsPersonnelle());
        return "accueil";
    }
}
