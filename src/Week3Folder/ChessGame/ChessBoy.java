/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3Folder.ChessGame;

/**
 *
 * @author Administrator
 */
public class ChessBoy {

    /**
     * String contains the one character symbols used to represent the chessmen.
     */
    public final static String SYMBOLS = "rhbqkp-";

    
    /**
     * String array that contains the names of each type of chessBoy.
     */
    public final static String[] NAMES = {"rook", "knight", "bishop", "queen",
        "king", "pawn", "empty"};

    /**
     * Array of doubles that represents the point value of each chessBoy.
     */
    public final static double[] POINTS = {5, 3, 3.5, 9, 2, 1, 0};

    /**
     * A String that contains a single letter that represents the type of
     * chessBoy.
     */
    protected String symbol; // rhbqkpRHBQKP-

    /**
     * Constructs a new chessBoy object for a given symbol.
     *
     * 
     * @param symbol
     */
    public ChessBoy(String symbol) {
        this.symbol = symbol;
    }

    /**
     * Checks to see if the symbol is valid.
     *
     * @param s
     * @return true or false
     */
    public boolean isValidSymbol(String s) {
        return s.matches("^[rhbqkpRHBQKP-]$");
    }

    /**
     * Gets the symbol representation of the chessBoy.
     *
     * @return symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Gets the name of the chessBoy.
     *
     * @return name
     */
    public String getName() {
        return NAMES[SYMBOLS.indexOf(symbol.toLowerCase())];
    }

    /**
     * Gets the point value for this piece.
     *
     * @return
     */
    public double getPoints() {
        return POINTS[SYMBOLS.indexOf(symbol.toLowerCase())];
    }

    /**
     * Returns the symbol representation of the chessBoy.
     *
     * @return symbol
     */
    @Override
    public String toString() {
        return getSymbol();
    }
}


