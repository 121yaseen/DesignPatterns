package commandpattern;

public class LightOnCommand implements ICommand{
    public Light light;
    public LightOnCommand(Light light)
    {
        this.light = light;
    }
    @Override
    public void execute() {
        System.out.println("Light turned ON");
        light.on();
    }

    @Override
    public void unexecute() {
        System.out.println("Light turned OFF");
        light.off();
    }
}
