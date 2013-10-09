package fr.meehome.cv.webapp.controller;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.meehome.cv.webapp.model.Authentification;
import fr.meehome.cv.webapp.model.User;
import fr.meehome.cv.webapp.utils.Pages;

@Controller
@RequestMapping("/accueil/")
public class AccueilController {

    private static final Logger LOG = Logger.getLogger(AccueilController.class);

    /**
     * Gestion des bean affichés dans la page
     * 
     * @return
     */
    @ModelAttribute("authentification")
    public Authentification getAuthentification() {
        LOG.debug("AccueilController :: getAuthentification");
        return new Authentification();
    }

    // AFFICHE LA PAGE D'ACCUEIL
    @RequestMapping(method = RequestMethod.GET)
    public String accueil(ModelMap model) {
        return Pages.accueil.getLibelle();
    }

    // AFFICHE LA PAGE D'INSCRIPTION
    @RequestMapping(value = "/inscription", method = RequestMethod.GET)
    public String inscription(ModelMap model) {
        model.addAttribute("user", new User());
        return Pages.inscription.getLibelle();
    }

    // VALIDATION FORMULAIRE INSCRIPTION
    @RequestMapping(value = "/inscription", method = RequestMethod.POST)
    public String connexion(@ModelAttribute("user")
    @Valid
    User user, BindingResult result) {
        if (result.hasErrors()) {
            return Pages.inscription.getLibelle();
        }
        return Pages.inscriptionSuccess.getLibelle();
    }
}
