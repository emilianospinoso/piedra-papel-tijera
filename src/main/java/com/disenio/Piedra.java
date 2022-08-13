package com.disenio;

public class Piedra extends Mano{
    @Override
    public String jugar(Mano mano2) {
        if (mano2 instanceof Piedra){
            return "Empate";
        }
        else if (mano2 instanceof Papel){
          return "Gana papel";
        }
        else {
            return "Gana piedra";
        }
    }


    @Override
    public String toString() {
        return "Soy una Piedra";
    }
}
