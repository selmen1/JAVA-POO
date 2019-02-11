package com.poocour;

public class Application {
    public static void main(String[] args){
        Ville ville1 = new Ville("Marseille", 123456789, "France");
        ville1.decrisToi();
        Capitale cap1 = new Capitale();
        cap1.decrisToi();
        Capitale cap2 = new Capitale("Marseille", 123456789, "France","mer");
        cap2.decrisToi();

    }
}
