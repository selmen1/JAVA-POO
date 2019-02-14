
package com.poocour;

import java.util.Objects;

public class Ville {

    //Stocke le nom de notre ville
   protected String nomVille;
    //Stocke le nom du pays de notre ville
    protected String nomPays;

    protected static int nbreInstance,nbreInstanceBis;

    protected int nbreHabitant;

    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public int getNbreHabitants() {
        return nbreHabitants;
    }

    public void setNbreHabitants(int nbreHabitants) {
        this.nbreHabitants = nbreHabitants;
    }

    //Stocke le nombre d'habitants de notre ville
    protected int nbreHabitants;

    //Constructeur par défaut
    public Ville(){
        System.out.println("Création d'une ville !");
        nomVille = "Inconnu";
        nomPays = "Inconnu";
        nbreHabitants = 0;
    }

    //Constructeur avec paramètres
    //J'ai ajouté un « p » en première lettre des paramètres.
    //Ce n'est pas une convention, mais ça peut être un bon moyen de les repérer.
    public Ville(String pNom, int pNbre, String pPays)
            throws NombreHabitantException, NomVilleException {
        if(pNbre < 0)
            throw new NombreHabitantException(pNbre);
        if(pNom.length() < 3)
            throw new NomVilleException("le nom de la ville est inférieur à 3 caractères ! nom = " + pNom);
        else
        {
            nbreInstance++;
            nbreInstanceBis++;

            nomVille = pNom;
            nomPays = pPays;
            nbreHabitant = pNbre;
        }
    }
    //methode descriToi
    public void decrisToi(){
        System.out.println(" ==> "+nomPays+" ==> "+nomVille+" ==> "+nbreHabitants);
    }

    public String toString(){
        return "\t"+this.nomVille+" est une ville de "+this.nomPays+", elle comporte : "+this.nbreHabitants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ville ville = (Ville) o;
        return nbreHabitants == ville.nbreHabitants &&
                Objects.equals(nomVille, ville.nomVille) &&
                Objects.equals(nomPays, ville.nomPays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomVille, nomPays, nbreHabitants);
    }
}