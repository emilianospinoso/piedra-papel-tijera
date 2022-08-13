package com.disenio;

public class Tijera extends Mano{
    @Override
    public String jugar(Mano mano2) {
        if (mano2 instanceof Tijera){
            return "Empate";
        }
        else if (mano2 instanceof Piedra){
            return "Gana piedra";
        }
        else {
            return "Gana tijera";
        }
    }

    @Override
    public String toString() {
        return "Soy una Tijera";
    }
}