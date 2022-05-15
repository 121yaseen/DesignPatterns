package commandpattern;

public class Invoker {
    ICommand on;
    ICommand off;

    public Invoker(ICommand on, ICommand off) {
        this.on = on;
        this.off = off;
    }

    public void clickOn() {
        on.execute();
    }
    public void clickOff() {
        off.execute();
    }
}
