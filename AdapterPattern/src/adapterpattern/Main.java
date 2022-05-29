package adapterpattern;

// The adapter pattern converts the interface of a class
// into another interface the clients expect.
// Adapter let classes work together that couldn't otherwise because of
// incompatible interfaces.
public class Main {
    public static void main(String[] args) {
        System.out.println("Adapter Pattern Main");

        ITarget target = new Adapter(new Adaptee());
        target.request(1024);
    }
}
