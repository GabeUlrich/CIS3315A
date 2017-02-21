package chess4;

/**
 *
 * @author gabe
 */
public class Rook extends Chessman {

    public Rook(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "rook";
    }

    @Override
    public String getSymbol() {
        return color.equals("white") ? "r" : "R";
    }

//    @Override
//    public String getColor() {
//        return color;
//    }

    @Override
    public double getPoints() {
        return 5;
    }

}
