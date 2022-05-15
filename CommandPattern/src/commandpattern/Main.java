package commandpattern;

// Undo ing and Redo ing becomes very trivial
public class Main {
    public static void main(String[] args) {
        System.out.println("Command Pattern Main");

        Invoker invoker = new Invoker(new LightOnCommand(new Light()), new LightOffCommand(new Light()));

        invoker.clickOn();
        invoker.clickOff();
    }
}
