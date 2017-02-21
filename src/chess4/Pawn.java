package chess4;

/**
 *
 * @author gabe
 */
public class Pawn extends Chessman {

    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "pawn";
    }

    @Override
    public String getSymbol() {
        return color.equals("white") ? "p" : "P";
    }

//    @Override
//    public String getColor() {
//        return color;
//    }

    @Override
    public double getPoints() {
        return 1;
    }

}
