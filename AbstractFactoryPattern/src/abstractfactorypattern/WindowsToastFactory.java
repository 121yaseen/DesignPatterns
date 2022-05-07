package abstractfactorypattern;

public class WindowsToastFactory implements IToastFactory{
    @Override
    public IToastMessage getToastMessageObject() {
        return new WindowsToastMessage();
    }

    @Override
    public IToastButton getToastButton() {
        return new WindowsToastButton();
    }
}
