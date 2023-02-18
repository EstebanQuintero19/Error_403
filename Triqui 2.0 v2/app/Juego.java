package com.triqui.app;

import com.triqui.dominio.Tabla;

import java.util.Objects;
import java.util.Scanner;

public class Juego {
    Tabla tabla = new Tabla();
    String jugador1, jugador2;

    public Juego(String jugador1, String jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public void juegoCooperativo() {
        int jugadas = 8;
        tabla.toGet(jugador1, jugador2);
        while (jugadas >= 0) {
            if ((jugadas % 2) == 0) {
                System.out.println("-->Juega el jugador('"+jugador1+"') 1<--");
                System.out.println("----------------------------------------");
                if (tabla.setCasillas(jugador1)) {
                    jugadas = jugadas - 1;
                    if (tabla.verificarVictoria(jugador1)) {
                        tabla.toGet(jugador1, jugador2);
                        System.out.println("EL JUGADOR("+jugador2+") 1 ES EL GANADOR!!!");
                        break;
                    }
                }
            }
            else {
                System.out.println("-->Juega el jugador('"+jugador2+"') 2<--");
                System.out.println("----------------------------------------");
                if (tabla.setCasillas(jugador2)) {
                    jugadas = jugadas - 1;
                    if (tabla.verificarVictoria(jugador2)) {
                        tabla.toGet(jugador1, jugador2);
                        System.out.println("EL JUGADOR("+jugador2+") 2 ES EL GANADOR!!!");
                        break;
                    }
                }
            }
            tabla.toGet(jugador1, jugador2);

        }
        System.out.println("JUEGO TERMINADO");
    }

    public void juegoIndividual(){
        boolean decision = true;
        int x, y;
        int jugadas = 8;
        tabla.toGet(jugador1, jugador2);
        while (jugadas >= 0) {
            if ((jugadas % 2) == 0) {
                System.out.println("-->Juega el jugador('"+jugador1+"') 1<--");
                System.out.println("----------------------------------------");
                if (tabla.setCasillas(jugador1)) {
                    jugadas = jugadas - 1;
                    if (tabla.verificarVictoria(jugador1)) {
                        tabla.toGet(jugador1, jugador2);
                        System.out.println("EL JUGADOR("+jugador1+") 1 ES EL GANADOR!!!");
                        break;
                    }
                }
            }
            else {
                System.out.println("-->Juega el jugador('"+jugador2+"') 2<--");
                System.out.println("----------------------------------------");
                do{
                    x = (int) (Math.random() * 10);
                    y = (int) (Math.random() * 10);
                    decision = x >= 3 || y >= 3;
                }while(decision);
                if (tabla.setCasillas(x , y, jugador2)) {
                    jugadas = jugadas - 1;
                    if (tabla.verificarVictoria(jugador2)) {
                        tabla.toGet(jugador1, jugador2);
                        System.out.println("EL JUGADOR("+jugador2+") 2 ES EL GANADOR!!!");
                        break;
                    }
                }
            }
            tabla.toGet(jugador1, jugador2);

        }
    }

}
