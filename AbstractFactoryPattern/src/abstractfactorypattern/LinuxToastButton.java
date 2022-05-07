package abstractfactorypattern;

public class LinuxToastButton implements IToastButton{
    @Override
    public void DoAction() {
        System.out.println("Doing Linux Toast Button Action");
    }
}
