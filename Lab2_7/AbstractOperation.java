package test;

public abstract class AbstractOperation {
    protected int a, b;
    public AbstractOperation(int a, int b) { this.a = a; this.b = b; }
    public abstract int result();
    public String info() {
        return getClass().getSimpleName() + ": " + a + ", " + b;
    }
}