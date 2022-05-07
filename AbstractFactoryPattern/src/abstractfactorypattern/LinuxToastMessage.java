package abstractfactorypattern;

public class LinuxToastMessage implements IToastMessage{
    @Override
    public String GetToastMessage() {
        return "Linux Toast Message";
    }
}
