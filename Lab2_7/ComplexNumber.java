package Lab2_7;

public class ComplexNumber extends RealNumber {
    private double imag;
    public ComplexNumber(double re, double im) {
        super(re); this.imag = im;
    }

    public ComplexNumber add(ComplexNumber o) {
        return new ComplexNumber(value + o.value, imag + o.imag);
    }

    public ComplexNumber sub(ComplexNumber o) {
        return new ComplexNumber(value - o.value, imag - o.imag);
    }

    public ComplexNumber mul(ComplexNumber o) {
        double r = value * o.value - imag * o.imag;
        double i = value * o.imag + imag * o.value;
        return new ComplexNumber(r, i);
    }

    public ComplexNumber div(ComplexNumber o) {
        double d = o.value * o.value + o.imag * o.imag;
        double r = (value * o.value + imag * o.imag) / d;
        double i = (imag * o.value - value * o.imag) / d;
        return new ComplexNumber(r, i);
    }

    public String toString() {
        return value + (imag >= 0 ? " + " : " - ") + Math.abs(imag) + "i";
    }
}