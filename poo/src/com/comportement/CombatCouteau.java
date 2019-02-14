package com.comportement;

public class CombatCouteau implements EspritCombatif {
    @Override
    public void combat() {
        System.out.println("Je me bats au couteau !");
    }
}
