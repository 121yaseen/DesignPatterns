package abstractfactorypattern;

public class MacToastMessage implements IToastMessage{
    @Override
    public String GetToastMessage() {
        return "Mac Toast Message";
    }
}
