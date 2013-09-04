package fr.meehome.cv.webapp.utils;

public enum Pages {

    accueil("accueil"), inscription("inscription"), inscriptionSuccess("inscriptionSuccess"), monCV("moncv");

    private String libelle;

    private Pages(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return this.libelle;
    }
}
