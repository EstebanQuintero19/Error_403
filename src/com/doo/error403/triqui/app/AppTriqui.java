package com.doo.error403.triqui.app;

import static com.doo.error403.triqui.dominio.Tablero.playPlayer;
import static com.doo.error403.triqui.dominio.Tablero.showBoard;

public class AppTriqui {
    public static void main(String[] args) {
        String[] board = {"_", "_", "_", "_", "_", "_", "_", "_", "_"};

        do{
        showBoard(board);
        playPlayer("X", board);
    }while(true);
}
}
