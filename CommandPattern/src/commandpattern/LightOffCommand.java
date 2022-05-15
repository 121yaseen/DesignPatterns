package commandpattern;

public class LightOffCommand implements ICommand{
    public Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Light turned OFF");
        this.light.off();
    }

    @Override
    public void unexecute() {
        System.out.println("Light turned ON");
        this.light.on();
    }
}
