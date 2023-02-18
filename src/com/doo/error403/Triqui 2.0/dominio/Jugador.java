package com.doo.error403.triqui.dominio;

import java.util.*;

public class Jugador {
    public static void playMulti(){
        Scanner reader = new Scanner(System.in);
        String[] board = {"-","-","-","-","-","-","-","-","-","-"};
        int attempt = setStart();
        boolean winner = false;

        String player1 = selectChar("Jugador 1");
        String player2 = validateEquals(player1);



        do{
            showBoard(board);
            String token = attempt%2==0? player1:player2;
            setToken(token,board);
            winner = evaluateWin(board);
            if(winner) System.out.println("Ganador de la partida " + token);
            attempt++;
        }while (!winner);
    }
     public static void showBoard(String [] board){
         System.out.println(board[7] + "|" + board[8] + "|" + board[9]);
         System.out.println(board[4] + "|" + board[5] + "|" + board[6]);
         System.out.println(board[1] + "|" + board[2] + "|" + board[3]);
     }

     public static String validateEquals(String player1){
        Scanner reader = new Scanner(System.in);
         while (true) {
             System.out.println("Ingresa caracter para Jugador 2");
             String player2 = reader.nextLine();
             if (player1 == player2){
                 System.out.println("Selecciona un carater diferente al Jugador 1");
                 break;
             }else {
                 String charPlayer2 = player2;

             }
         }

     }




     public static int setStart(){
        while (true){
            Scanner reader = new Scanner(System.in);
            System.out.println("Quien inicia la partida?\n1. Jugador 1\n2. Jugador 2\n3. Al azar");
            int start = reader.nextInt();
            if (start == 1){
                int attempt = 0;
                return attempt;
            } else if (start == 2) {
                int attempt = 1;
                return attempt;
            } else if (start == 3) {
                Random aux = new Random();
                int attempt = aux.nextInt(1);
                return attempt;

            }
        }
     }

     public static void setToken(String token, String [] board) {
         Scanner reader = new Scanner(System.in);
         while (true) {
             System.out.println("Elige posicion para poner ficha " + token);
             int position = reader.nextInt();
             if (board[position].equals("-")){
                 board[position] = token;
                 break;
             }else {
                 System.out.println("Casilla ocupada, elige una vacia");
             }

         }

    }

     public static boolean evaluateWin(String board[]) {
        if (board[1].equals(board[2]) && board[1].equals(board[3]) && !board[1].equals("_")){
            return true;
        } else if (board[4].equals(board[5]) && board[4].equals(board[6]) && !board[4].equals("-")){
            return true;
        } else if (board[7].equals(board[8]) && board[7].equals(board[9]) && !board[7].equals("-")){
            return true;
        } else if (board[1].equals(board[4]) && board[1].equals(board[7]) && !board[1].equals("-")){
            return true;
        } else if (board[2].equals(board[5]) && board[2].equals(board[8]) && !board[2].equals("-")){
            return true;
        } else if (board[3].equals(board[6]) && board[3].equals(board[9]) && !board[3].equals("-")){
            return true;
        } else if (board[7].equals(board[5]) && board[7].equals(board[3]) && !board[7].equals("-")){
            return true;
        } else if (board[1].equals(board[5]) && board[1].equals(board[9]) && !board[1].equals("_")){
            return true;
        }
        return false;
     }

     public static String selectChar(String playerName){
        Scanner reader = new Scanner(System.in);
         while (true) {
             System.out.println("Ingresa caracter para "+ playerName);
             String token = reader.nextLine();
             if (token.length() == 1){
                 String player = token;
                 return player;
             }else {
                 System.out.println("Ingresa un solo valor");
             }
             }

         }

}












