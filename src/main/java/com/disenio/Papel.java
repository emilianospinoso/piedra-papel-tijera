package com.disenio;

public class Papel extends Mano{
    @Override
    public String jugar(Mano mano2) {
        if (mano2 instanceof Papel){
            return "Empate";
        }
        else if (mano2 instanceof Piedra){
            return "Gana papel";
        }
        else if (mano2 instanceof Tijera){
            return "Gana tijera";
        }
        else {
            return "Gana piedra";
        }
    }


    @Override
    public String toString() {
        return "Soy una Papel";
    }
}