package xyx.StategyPattern;

public class JetFlyBehaviour implements IFlyBehaviour{
    @Override
    public void fly() {
        System.out.println("ignition sequence start ... 6, 5, 4, 3, 2, 1, 0 ... All engines running. Liftoff! We have a liftoff ... ");
    }
}
