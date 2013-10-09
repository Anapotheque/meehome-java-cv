package fr.meehome.cv.webapp.controller;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.meehome.cv.webapp.model.User;
import fr.meehome.cv.webapp.utils.Pages;

@Controller
@RequestMapping("/accueil/")
public class AccueilController extends MetaController {

    private static final Logger LOG = Logger.getLogger(AccueilController.class);

    /**
     * On affiche la page d'accueil
     * 
     * @param model
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String accueil(ModelMap model) {
        return Pages.accueil.getLibelle();
    }

    /**
     * On affiche la page d'inscription
     * 
     * @param model
     * @return
     */
    @RequestMapping(value = "/accueil/inscription", method = RequestMethod.GET)
    public String inscription(ModelMap model) {
        return Pages.inscription.getLibelle();
    }

    /**
     * On affiche la page de mise à jour user
     * 
     * @param model
     * @return
     */
    @RequestMapping(value = "/accueil/updateUser", method = RequestMethod.GET)
    public String updateUser(ModelMap model) {
        return Pages.inscription.getLibelle();
    }

    /**
     * Validation du formulaire d'inscription
     * 
     * @param user
     * @param result
     * @return
     */
    @RequestMapping(value = "/accueil/inscription", method = RequestMethod.POST)
    public String connexion(@ModelAttribute("user")
    @Valid
    User user, BindingResult result) {
        if (result.hasErrors()) {
            return Pages.inscription.getLibelle();
        }
        return Pages.inscriptionSuccess.getLibelle();
    }
}
