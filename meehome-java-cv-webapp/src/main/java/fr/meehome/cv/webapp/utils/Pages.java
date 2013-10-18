package fr.meehome.cv.webapp.utils;

public enum Pages {

    accueil("accueil"), inscriptionUser("inscriptionUser"), updateUser("updateUser"), validationFormulaireSuccess(
                    "validationFormulaireSuccess"), monCV("moncv");

    private String libelle;

    private Pages(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return this.libelle;
    }
}
