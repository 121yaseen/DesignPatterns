package abstractfactorypattern;

public interface IToastFactory {
    IToastMessage getToastMessageObject();
    IToastButton getToastButton();
}
