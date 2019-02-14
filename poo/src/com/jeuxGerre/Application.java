package com.jeuxGerre;

import com.comportement.*;

class Application{
    public static void main(String[] args) {
        Personnage[] tPers = {new Guerrier(), new Civil(), new Medecin()};

        for(int i = 0; i < tPers.length; i++){
            System.out.println("\nInstance de " + tPers[i].getClass().getName());
            System.out.println("*****************************************");
            tPers[i].combattre();
            tPers[i].seDeplacer();
            tPers[i].soigner();

          /*  Personnage pers = new Guerrier();
            pers.soigner();
            pers.setSoin(new Operation());
            pers.soigner();*/
        }
    }
}