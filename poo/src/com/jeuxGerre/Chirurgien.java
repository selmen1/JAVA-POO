package com.jeuxGerre;

import com.comportement.*;
public class Chirurgien extends Personnage{
    public Chirurgien() {
        this.soin = new PremierSoin();
    }
    public Chirurgien(EspritCombatif esprit, Soin soin, Deplacement dep) {
        super(esprit, soin, dep);
    }
}
