package xyx.StategyPattern;

// Strategy Pattern decouples the algorithm from the one that uses the algorithm
// Clients that are using the algorithm will not be forced to change when we need
// to change the algorithm
public class Main {
    public static void main(String[] args) {
        System.out.println("Strategy Pattern Main");

        var cityDuck = new CityDuck();
        cityDuck.quack();
        cityDuck.fly();

        var rubberDuck = new RubberDuck();
        rubberDuck.quack();
        rubberDuck.fly(); // Rubber duck isn't supposed to fly

        // If some inherited classes need to share a same behavior other than that of base's
        // there is no way
        // Inheritance helps in top to bottom sharing
        // But not useful when the sharing happens in same levels
        // Multiple inheritance can be used to solve these issues but
        // The solution to problems due to inheritance is not more inheritance

        var cloudDuck = new CloudDuck();
        cloudDuck.fly();
        cloudDuck.quack();

        var mountainDuck = new MountainDuck();
        mountainDuck.fly();
        mountainDuck.quack();

        // In Strategy Duck we can create different ducks by passing
        // different strategies
        var newMountainDuck = new StrategyDuck(new JetFlyBehaviour(), new GraphicalDisplayBehaviour(), new SimpleQuackBehaviour());
        newMountainDuck.fly();
        var newCloudDuck = new StrategyDuck(new JetFlyBehaviour(), new GraphicalDisplayBehaviour(), new NoQuackBehaviour());
        newCloudDuck.display();
    }
}
