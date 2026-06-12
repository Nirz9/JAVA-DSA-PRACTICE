class InnerCalculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

}

class InnerCalculator_1 extends InnerCalculator {
    @Override
    int add(int a, int b) {
        return a + b + 10;
    }

}

public class Calculator {
    public static void main(String[] args) {
        InnerCalculator_1 c1 = new InnerCalculator_1();
        System.out.println(c1.add(5, 10));
        System.out.println(c1.add(100.54, 123.54));
        System.out.println(c1.add(21, 45));

    }
}
