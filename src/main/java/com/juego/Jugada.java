package com.juego;

import com.disenio.Mano;
import com.disenio.Papel;
import com.disenio.Piedra;
import com.disenio.Tijera;

import java.util.ArrayList;

public class Jugada {

    public static void main(String[] args) {
        ArrayList<Integer> numerosAzar =  tirarNums();
        Mano manoUno = generarMano(numerosAzar.get(0));
        System.out.println("Primer Mano generada = "+ manoUno);
        Mano manoDos = generarMano(numerosAzar.get(1));
        System.out.println(" Segunda Mano generada = "+ manoDos);
        System.out.println(manoUno.jugar(manoDos));
        //aca realizo otro cambio
        //cambioooo realizado en la rama feature
        //opa , cambioooo en feature2
        //un cambio en master re imporante!!!!

    }

    public static String jugar(int number1, int number2){
        Mano manoUno = generarMano(number1);
        Mano manoDos = generarMano(number2);
        return (manoUno.jugar(manoDos));
    }

    private static ArrayList<Integer> tirarNums() {
        ArrayList<Integer> nums = new ArrayList<>(2);
        int num1 = (int) Math.floor(Math.random()*(3-1+1)+1);
        System.out.println("El Primer numero random es: " +num1);
        int num2 = (int) Math.floor(Math.random()*(3-1+1)+1);
        System.out.println("El Segundo numero random es: " +num2);
        nums.add(0, num1);
        nums.add(1, num2);
        return nums;
    }

    private static Mano generarMano(Integer numero) {
        if (numero == 1){
            return new Piedra();
        } else if (numero ==2) {
            return new Papel();
        }else{
            return new Tijera();
        }
    }
}
