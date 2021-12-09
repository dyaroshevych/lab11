package tray;

public interface Tray {
    void process(int amount);
    void setNext(Tray tray);
}
