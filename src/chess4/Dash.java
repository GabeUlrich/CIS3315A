package chess4;

/**
 *
 * @author gabe
 */
public class Dash extends Chessman {

    public Dash(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "dash";
    }

    @Override
    public String getSymbol() {
        return color.equals("white") ? "-" : "-";
    }

//    @Override
//    public String getColor() {
//        return color;
//    }

    @Override
    public double getPoints() {
        return 0;
    }

}
