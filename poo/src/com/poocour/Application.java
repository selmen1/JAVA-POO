package com.poocour;

public class Application {
    public static void main(String[] args){
        Ville ville1 = null;
        try {
            ville1 = new Ville("Marseille", 123456789, "France");
        } catch (NombreHabitantException e) {
            e.printStackTrace();
        } catch (NomVilleException e2) {
            System.out.println(e2.getMessage());
        } finally {
            if (ville1==null){ville1=new Ville();}
        }

        ville1.decrisToi();
        Capitale cap1 = new Capitale();
        cap1.decrisToi();
        Capitale cap2 = new Capitale("Marseille", 123456789, "France","mer");
        cap2.decrisToi();

        //Définition d'un tableau de villes null
        Ville[] tableau = new Ville[6];

        //Définition d'un tableau de noms de Villes et un autre de nombres d'habitants
        String[] tab = {"Marseille", "lille", "caen", "lyon", "paris", "nantes"};
        int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};

        //Les trois premiers éléments du tableau seront des Villes
        //et le reste des capitales
            for(int i = 0; i < 6; i++){
                if (i <3){
                    Ville V = null;
                    try {
                        V = new Ville(tab[i], tab2[i], "france");
                    } catch (NombreHabitantException e) {
                        e.printStackTrace();
                    } catch (NomVilleException e2) {
                        System.out.println(e2.getMessage());
                    } finally {
                        if (V==null){V=new Ville();}
                    }
                    tableau[i] = V;
                }

                else{
                    Capitale C = new Capitale(tab[i], tab2[i], "france", "la tour Eiffel");
                    tableau[i] = C;
                }
            }

        //Il ne nous reste plus qu'à décrire tout notre tableau !
            for(Object obj : tableau){
                System.out.println(obj.toString()+"\n");
            }

    }
}
