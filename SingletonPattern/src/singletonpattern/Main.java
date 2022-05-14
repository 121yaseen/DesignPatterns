package singletonpattern;

// The singleton pattern ensures a class has only one instance
// and provides a global point of access to it.
// Singleton pattern ensures that it's impossible to
// instantiate that class except for a single time
// and whenever we want an instance you would inevitably
// have to use that instance

// There exists a controversy regarding singleton pattern
// and many argue that singleton pattern is actually a code smell
// 1. Violating the practice to avoid global variables
// 2. Making sure that you have a single instance is an absurd idea
//    because we are assuming we will ever need only a single instance
//    of a class in a growing application
// Also singleton makes unit testing hard
// "One man's constant is another man's variable"
// It is fine to have only a single instance in the whole application
// but is not a good idea to make it impossible to create a second instance
public class Main {
    public static void main(String[] args) {
        System.out.println("Singleton Pattern Main");

        Singleton firstInstance = Singleton.getInstance();
        firstInstance.setMessage("Message set from 1st instance");

        Singleton secondInstance = Singleton.getInstance();
        System.out.println("Printing message from 2nd instance");
        System.out.println(secondInstance.getMessage());
    }
}
