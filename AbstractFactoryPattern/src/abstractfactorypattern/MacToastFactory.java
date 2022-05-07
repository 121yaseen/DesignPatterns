package abstractfactorypattern;

public class MacToastFactory implements IToastFactory{
    @Override
    public IToastMessage getToastMessageObject() {
        return new MacToastMessage();
    }

    @Override
    public IToastButton getToastButton() {
        return new MacToastButton();
    }
}
