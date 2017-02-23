package Week4Folder.Chapter13HW;

/**
 * Class to work with complex numbers.
 *
 * @author Administrator Gabe - solutions Profphilips
 */
public class HWpage531c13n17 {

    public static void main(String[] args) {
        Complex c1 = new Complex(3.5, 5.5);

    }
}

class Complex implements Cloneable {

    // a + bi
    private double a; // real part
    private double b; // imaginary part

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Complex add(Complex c) {
        return new Complex((a + c.getA()), (b + c.getB()));
    }

    public Complex sub(Complex c) {
        return new Complex((a - c.getA()), (b - c.getB()));
    }

}
