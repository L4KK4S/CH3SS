/*
   |=========================================|
   |Piece Class >> for the pieces management |
   |=========================================|
*/

// #================ IMPORTS ================#
package fr.l4kk4s.ch3ss;

public class Piece {

    // *------------ Variables -------------*
    Game gameInstance;
    int[] pos = new int[2];                        // The postion of the pawn in the board (x, y)
    int color;                                     // The color of the pawn
    boolean isAlive = true;                        // If the pawn is alive or not
    String type;                                    // The type of the piece

    // *----------- Constructor ------------*
    public Piece(int x, int y, int p_color, char p_type){

        pos[0] = x;
        pos[1] = y;
        color = p_color;

        switch (p_type){

            case 'P':
                type = "Pawn";

            case 'R':
                type = "Rook";

            case 'N':
                type = "Knight";

            case 'B':
                type = "Bishop";

            case 'Q':
                type = "Queen";

            case 'K':
                type = "King";

            default:
                System.out.println("ERROR: The type of the piece is not valid");
                break;

        }

    }

    // *------------ Methods ---------------*

    public String getDisplayName(){

        switch (type){

            case "Pawn":
                return "P";

            case "Rook":
                return "R";

            case "Knight":
                return "N";

            case "Bishop":
                return "B";

            case "Queen":
                return "Q";

            case "King":
                return "K";

            default:
                return "";

        }

    }

}
