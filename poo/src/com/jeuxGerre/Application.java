package com.jeuxGerre;

public class Application {
    public static void main(String[] args) {
        Personnage[] tPers = {new Guerrier(), new Chirurgien(), new Civil(), new Sniper(), new Medecin()};

        for(Personnage p : tPers){
            System.out.println("\nInstance de " + p.getClass().getName());
            System.out.println("***************************************");
            p.combattre();
            p.seDeplacer();
        }
    }
}
