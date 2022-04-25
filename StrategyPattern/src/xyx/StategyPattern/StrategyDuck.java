package xyx.StategyPattern;

public class StrategyDuck implements IQuackBehaviour, IDisplayBehaviour, IFlyBehaviour{
    IFlyBehaviour flyBehaviour;
    IDisplayBehaviour displayBehaviour;
    IQuackBehaviour quackBehaviour;
    public StrategyDuck(IFlyBehaviour flyBehaviour, IDisplayBehaviour displayBehaviour, IQuackBehaviour quackBehaviour)
    {
        this.flyBehaviour = flyBehaviour;
        this.displayBehaviour = displayBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    @Override
    public void display() {
        this.displayBehaviour.display();
    }

    @Override
    public void fly() {
        this.flyBehaviour.fly();
    }

    @Override
    public void quack() {
        this.quackBehaviour.quack();
    }
}
