package abstractfactorypattern;

public class WindowsToastMessage implements IToastMessage{
    @Override
    public String GetToastMessage() {
        return "Windows Toast Message";
    }
}
