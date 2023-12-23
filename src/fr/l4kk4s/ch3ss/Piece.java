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
                break;

            case 'R':
                type = "Rook";
                break;

            case 'N':
                type = "Knight";
                break;

            case 'B':
                type = "Bishop";
                break;

            case 'Q':
                type = "Queen";
                break;

            case 'K':
                type = "King";
                break;

            default:
                System.out.println("ERROR: The type of the piece is not valid");
                break;

        }

    }

    // *------------ Methods ---------------*

    public String getDisplayName(){

        String displayName;

        if (color == 0){
            displayName = "\u001B[31m";
        }else{
            displayName = "\u001B[34m";
        }


        switch (type){

            case "Pawn":
                displayName += "\u2659";
                break;

            case "Rook":
                displayName += "\u2656";
                break;

            case "Knight":
                displayName += "\u2658";
                break;

            case "Bishop":
                displayName += "\u2657";
                break;

            case "Queen":
                displayName += "\u2655";
                break;

            case "King":
                displayName += "\u2654";
                break;

            default:
                return "";

        }

        displayName += "\u001B[0m";
        return displayName;

    }

}
