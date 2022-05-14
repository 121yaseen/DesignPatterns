package singletonpattern;

// We can further secure the class using sealed and all
// but that's just language specific
// not necessarily related to the singleton concept
public class Singleton {
    private String message = "";
    private static Singleton instance;
    private Singleton(){
        System.out.println("Instance of singleton created");
    }
    public static Singleton getInstance()
    {
        System.out.println("Returning instance of class");
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
