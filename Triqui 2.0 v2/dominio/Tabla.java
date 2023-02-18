package com.triqui.dominio;

import java.util.Objects;
import java.util.Scanner;

public class Tabla {
    String [][] matriz = new String[3][3];
    public void toGet(String jugador1, String jugador2) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("  -------------------");
            System.out.print(i+1+" ");
            for (int j = 0; j < matriz[0].length; j++) {
                if(Objects.equals(matriz[i][j], jugador1)){
                    System.out.print("|  "+matriz[i][j]+"  ");
                }
                else if(Objects.equals(matriz[i][j], jugador2)){
                    System.out.print("|  "+matriz[i][j]+"  ");
                }
                else{
                    System.out.print("|     ");
                }

            }
            System.out.println("|");
        }
        System.out.println("  -------------------");
        System.out.println("     1     2     3");
    }

    public boolean setCasillas(String jugador) {
        Scanner entrada = new Scanner(System.in);
        int x,y;
        System.out.print("Ingresa una posición(X)->");
        x = entrada.nextInt()-1;
        System.out.print("Ingresa una posición(Y)->");
        y = entrada.nextInt()-1;
        if (x>=3 || y>=3) {
            System.out.println("--ADVERTENCIA--");
            System.out.println("Fuera del rango");
            System.out.println("---------------");
            return false;
        }
        else if (matriz[y][x] != null){
            System.out.println("--ADVERTENCIA--");
            System.out.println("Casilla ocupada");
            System.out.println("---------------");
            return false;
        }
        else if(matriz.length > x && matriz[0].length > y){
            matriz[y][x] = jugador;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean setCasillas(int x,int y,String jugador) {
        if (matriz[y][x] != null){
            return false;
        }
        else if(matriz.length > x && matriz[0].length > y){
            matriz[y][x] = jugador;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean verificarVictoria(String jugador){
        for(int i = 0;i<matriz.length; i++){
            if (matriz[i][1] == jugador && matriz[i][0] == jugador && matriz[i][2] == jugador){return true;}
            else if (matriz[1][i] == jugador && matriz[0][i] == jugador && matriz[2][i] == jugador) {return true;}
        }
        if(matriz[0][0] == jugador && matriz[1][1] == jugador && matriz[2][2] == jugador){return true;}
        else if (matriz[2][0] == jugador && matriz[1][1] == jugador && matriz[0][2] == jugador) {return true;}
        else{return false;}
    }
}

