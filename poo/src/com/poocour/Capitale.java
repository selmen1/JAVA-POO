package com.poocour;

class Capitale extends Ville {

    private String monument;

    //Constructeur par défaut
    public Capitale(){
        //Ce mot clé appelle le constructeur de la classe mère
        super();
        monument = "aucun";
    }

    //Constructeur d'initialisation de capitale
    public Capitale(String nom, int hab, String pays, String monument){
        super(nom, hab, pays);
        this.monument = monument;
    }

    public String getMonument() {
        return monument;
    }

    public void setMonument(String monument) {
        this.monument = monument;
    }

    public void decrisToi(){
        super.decrisToi();
        System.out.println(" ==> "+monument);
    }
}

