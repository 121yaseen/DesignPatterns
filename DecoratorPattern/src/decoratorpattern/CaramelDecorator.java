package decoratorpattern;

public class CaramelDecorator extends AddonDecorator{
    Beverage beverage;
    public CaramelDecorator(Beverage beverage)
    {
        this.beverage = beverage;
    }
    @Override
    int cost() {
        return beverage.cost() + 2;
    }
}
