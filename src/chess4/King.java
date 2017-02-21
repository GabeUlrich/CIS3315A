package chess4;

/**
 *
 * @author gabe
 */
public class King extends Chessman {

    public King(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "king";
    }

    @Override
    public String getSymbol() {
        return color.equals("white") ? "k" : "K";
    }

//    @Override
//    public String getColor() {
//        return color;
//    }

    @Override
    public double getPoints() {
        return 2;
    }

}
