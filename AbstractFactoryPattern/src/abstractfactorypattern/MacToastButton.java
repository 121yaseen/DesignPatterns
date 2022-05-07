package abstractfactorypattern;

public class MacToastButton implements IToastButton{
    @Override
    public void DoAction() {
        System.out.println("Doing Mac Toast Button Action");
    }
}
