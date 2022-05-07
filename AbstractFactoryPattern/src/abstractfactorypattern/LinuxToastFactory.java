package abstractfactorypattern;

public class LinuxToastFactory implements IToastFactory{
    @Override
    public IToastMessage getToastMessageObject() {
        return new LinuxToastMessage();
    }

    @Override
    public IToastButton getToastButton() {
        return new LinuxToastButton();
    }
}
