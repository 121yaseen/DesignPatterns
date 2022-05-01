package factorymethodpattern;
// It is possible that instantiation of object is complex
// Inorder to instantiate an object we may need some kind of computation
// It's also about polymorphism
// Instance of factory can be swapped at runtime
// Domestic animals and their wild version factories
// Factory is responsible for holding the business logic
// of creation of something of a particular shared type

// Factory Method Pattern defines an interface for creating an object
// But lets subclasses decide which class to instantiate
// Factory method lets the class defer instantiation of subclasses
public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Method Pattern");
    }
}
