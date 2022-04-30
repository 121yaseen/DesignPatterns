package decoratorpattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Decorator Pattern Main");

        Beverage beverage = new CaramelDecorator(new Expresso());

        System.out.println(beverage.cost());
    }
}
