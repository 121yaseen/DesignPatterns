package xyx.StategyPattern;

public class MountainDuck extends RefactoredDuck{
    @Override
    public void quack() {
        new SimpleQuackBehaviour().quack();
    }

    @Override
    public void fly() {
        new JetFlyBehaviour().fly();
    }
}
