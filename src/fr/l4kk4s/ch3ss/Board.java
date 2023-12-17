/*
   |=========================================|
   | Board Class >> for the board management |
   |=========================================|
*/

// #================ IMPORTS ================#
package fr.l4kk4s.ch3ss;


// #============== BOARD CLASS ====+=========#
public class Board {

    // *------------ Variables -------------*
    Game gameInstance;
    Piece[][] board = new Piece[8][8];                        // The board of the game

    // *----------- Constructor ------------*

    public Board(Game g){
        gameInstance = g;
        gridInitialisation();
    }

    // *------------ Methods ---------------*

    // function to initialise the board
    public void gridInitialisation(){

        // We fill the board with null
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                board[j][i] = null;
            }
        }

    }


    @Override
    public String toString(){

        String board_str = "    A   B   C   D   E   F   G   H\n   ===============================\n";
        String temp_line;

        for(int i = 0; i < 8; i++){

            temp_line = i + " | ";
            for(int j = 0; j < 8; j++){
                if (board[j][i] != null){
                    temp_line += board[j][i].getDisplayName() + " | ";
                }else{
                    temp_line += "  | ";
                }
            }
            board_str += temp_line + i + "\n   ===============================\n";

        }

        board_str += "    A   B   C   D   E   F   G   H\n";
        return board_str;

    }


}
