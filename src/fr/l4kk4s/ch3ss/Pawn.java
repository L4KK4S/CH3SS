/*
   |=========================================|
   |  Pawn Class >> for the pawns management |
   |           subclass of Piece             |
   |=========================================|
*/

// #================ IMPORTS ================#
package fr.l4kk4s.ch3ss;

// #=============== PAWN CLASS ==============#
public class Pawn extends Piece {

    // *------------ Variables -------------*
    int[] pos = new int[2];                        // The postion of the pawn in the board (x, y)
    int color;                                     // The color of the pawn
    boolean isAlive = true;                        // If the pawn is alive or not

    // *----------- Constructor ------------*
    public Pawn(int x, int y, int p_color){
        super(x, y, p_color, 'P');
    }

    // *------------ Methods ---------------*

    @Override
    public String toString(){
        return "The pawn: " + "(" + pos[0] + ";" + pos[1] + ") is " + (isAlive ? "alive" : "dead") + " and is " + (color == 0 ? "white" : "black") + ".";
    }

}
