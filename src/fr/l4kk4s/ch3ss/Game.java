/*
   |=========================================|
   | Game Class >> for the game management   |
   |=========================================|
*/

// #================ IMPORTS ================#
package fr.l4kk4s.ch3ss;
import java.util.Scanner;
import java.util.Arrays;


// #=============== GAME CLASS ==============#
public class Game {

    // *------------ Variables -------------*
    Piece[] whitePieces = new Piece[16];                                                                // We create the white pawns arrays
    Piece[] blackPieces = new Piece[16];                                                                // We create the white pawns arrays
    Board theBoard;                                                                                     // We create the board


    // *----------- Constructor ------------*
    public Game(){
        theBoard = new Board(this);
    }


    // *------------ Methods ---------------*


}
