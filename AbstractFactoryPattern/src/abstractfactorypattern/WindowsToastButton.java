package abstractfactorypattern;

public class WindowsToastButton implements IToastButton{
    @Override
    public void DoAction() {
        System.out.println("Doing Windows Toast Button Action");
    }
}
