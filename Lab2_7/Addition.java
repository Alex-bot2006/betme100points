package test;

public class Addition extends AbstractOperation {
    public Addition(int a, int b) { super(a, b); }
    public int result() { return a + b; }
}