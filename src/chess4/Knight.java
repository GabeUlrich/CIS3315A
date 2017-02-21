package chess4;

/**
 *
 * @author gabe
 */
public class Knight extends Chessman {

    public Knight(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "knight";
    }

    @Override
    public String getSymbol() {
        return color.equals("white") ? "h" : "H";
    }

//    @Override
//    public String getColor() {
//        return color;
//    }

    @Override
    public double getPoints() {
        return 3;
    }

}
