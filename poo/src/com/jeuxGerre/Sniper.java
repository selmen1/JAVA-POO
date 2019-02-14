package com.jeuxGerre;

import com.comportement.*;

public class Sniper extends Personnage {
    public Sniper(){
        this.espritCombatif = new CombatPistolet();
    }
    public Sniper(EspritCombatif esprit, Soin soin, Deplacement dep) {
        super(esprit, soin, dep);
    }
}