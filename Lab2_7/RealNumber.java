package Lab2_7;

public class RealNumber {
    protected double value;
    public RealNumber(double value) { this.value = value; }

    public static double add(double a, double b) { return a + b; }
    public static double sub(double a, double b) { return a - b; }
    public static double mul(double a, double b) { return a * b; }
    public static double div(double a, double b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }

    public double getValue() { return value; }
}