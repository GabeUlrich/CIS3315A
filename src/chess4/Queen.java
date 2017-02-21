package chess4;

/**
 *
 * @author gabe
 */
public class Queen extends Chessman {

    public Queen(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "queen";
    }

    @Override
    public String getSymbol() {
        return color.equals("white") ? "q" : "Q";
    }

//    @Override
//    public String getColor() {
//        return color;
//    }

    @Override
    public double getPoints() {
        return 9;
    }

}
