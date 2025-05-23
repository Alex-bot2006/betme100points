public class Main {
    public static void main(String[] args) {
        // Task 1
        double a = 10, b = 2;
        System.out.println("Add: " + RealNumber.add(a, b));
        System.out.println("Sub: " + RealNumber.sub(a, b));
        System.out.println("Mul: " + RealNumber.mul(a, b));
        System.out.println("Div: " + RealNumber.div(a, b));

        // Task 2
        RealNumber[] real = { new RealNumber(10), new RealNumber(5), new RealNumber(2) };
        ComplexNumber[] comp = {
            new ComplexNumber(3, 2),
            new ComplexNumber(1, -1),
            new ComplexNumber(4, 0.5)
        };

        System.out.println("\nReal Operations:");
        for (int i = 0; i < real.length - 1; i++) {
            System.out.println("Add: " + RealNumber.add(real[i].getValue(), real[i+1].getValue()));
            System.out.println("Sub: " + RealNumber.sub(real[i].getValue(), real[i+1].getValue()));
        }

        System.out.println("\nComplex Operations:");
        for (int i = 0; i < comp.length - 1; i++) {
            System.out.println("Add: " + comp[i].add(comp[i+1]));
            System.out.println("Sub: " + comp[i].sub(comp[i+1]));
        }

        // Task 3
        AbstractOperation[] ops = {
            new Addition(3, 4),
            new Subtraction(10, 7),
            new Addition(5, 5),
            new Subtraction(8, 3)
        };

        System.out.println("\nAbstract Operations:");
        for (AbstractOperation op : ops)
            System.out.println(op.info() + " = " + op.result());
    }
}