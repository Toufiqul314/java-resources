package Generics;

enum Opration {
    ADD, SUBTRAC, MULTIPLY, DIVIDE;

    public <T extends Number> double apply(T a, T b) {
        switch (this) {
            case ADD:
                return a.doubleValue() + b.doubleValue();
            case SUBTRAC:
                return a.doubleValue() - b.doubleValue();
            case MULTIPLY:
                return a.doubleValue() * b.doubleValue();
            case DIVIDE:
                return a.doubleValue() / b.doubleValue();

            default:
                throw new AssertionError("Unknown Opration:" + this);
        }

    }
}

public class EnumGenerics {
    public static void main(String[] args) {
        double res1 = Opration.ADD.apply(10, 20);
        System.out.println(res1);
    }
}
