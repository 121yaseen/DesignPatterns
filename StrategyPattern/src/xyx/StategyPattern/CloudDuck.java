package xyx.StategyPattern;

public class CloudDuck extends RefactoredDuck{
    @Override
    public void quack() {
        new NoQuackBehaviour().quack();
    }

    @Override
    public void fly() {
        new JetFlyBehaviour().fly();
    }
}
