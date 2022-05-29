package adapterpattern;

public class Adapter implements ITarget{
    Adaptee adaptee;
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request(int aValue) {
        adaptee.specificRequest(String.valueOf(aValue));
    }
}
