package xyx.StategyPattern;

public class CityDuck extends Duck{
    @Override
    public void quack() {
        System.out.println("City Duck Quack");
    }

    @Override
    public void fly() {
        // Even though both city and wild duck need to have same behavior other than that of base's
        // we can't share them
        // Code duplication
        System.out.println("Normal Duck started flying");
    }
}
