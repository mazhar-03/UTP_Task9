package exercises.Task3;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new CalculatorImpl();

        Calculator proxy = (Calculator) LoggingProxy.createProxy(calc);
        System.out.println(proxy.add(3, 9));
    }
}
