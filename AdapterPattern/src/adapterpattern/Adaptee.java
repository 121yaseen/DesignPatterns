package adapterpattern;

public class Adaptee {
    void specificRequest(String stringValue)
    {
        System.out.println("Do some specific thing");
        System.out.println(stringValue);
    }
}
