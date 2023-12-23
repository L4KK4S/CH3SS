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
        setPieces();
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

    // function to set the pieces in the board
    public void setPieces(){

        for(int i = 0; i < 8; i++){

            // We set the pawns
            board[i][1] = new Piece(i, 1, 0, 'P');
            board[i][6] = new Piece(i, 6, 1, 'P');

            // We set the rooks
            if(i == 0 || i == 7){
                board[i][0] = new Piece(i, 0, 0, 'R');
                board[i][7] = new Piece(i, 7, 1, 'R');
            }

            // We set the knights
            if(i == 1 || i == 6){
                board[i][0] = new Piece(i, 0, 0, 'N');
                board[i][7] = new Piece(i, 7, 1, 'N');
            }

            // We set the bishops
            if(i == 2 || i == 5){
                board[i][0] = new Piece(i, 0, 0, 'B');
                board[i][7] = new Piece(i, 7, 1, 'B');
            }

            // We set the queens
            if(i == 3){
                board[i][0] = new Piece(i, 0, 0, 'Q');
                board[i][7] = new Piece(i, 7, 1, 'Q');
            }

            // We set the kings
            if(i == 4){
                board[i][0] = new Piece(i, 0, 0, 'K');
                board[i][7] = new Piece(i, 7, 1, 'K');
            }

        }

    }


    @Override
    public String toString(){

        String board_str = "     A   B   C    D    E   F    G   H\n   ====================================\n";
        String temp_line;

        for(int i = 0; i < 8; i++){ // i = rows

            temp_line = (8 - i) + " | ";
            for(int j = 0; j < 8; j++){
                if (board[j][i] != null){
                    temp_line += board[j][i].getDisplayName() + " | ";
                }else{
                    temp_line += " \u2003| ";
                }
            }
            board_str += temp_line + (8 - i) + "\n   ====================================\n";

        }

        board_str += "     A   B   C    D    E   F    G   H\n";
        return board_str;

    }


}
