package com.animal;

public class Chat extends Felin {


        public Chat(){

        }
        public Chat(String couleur, int poids){
            this.couleur = couleur;
            this.poids = poids;
        }
    @Override
        void crier() {
            System.out.println("Je miaule sur les toits !");
        }



}
