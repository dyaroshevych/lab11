package atm;

import tray.Tray;
import tray.Tray10;
import tray.Tray20;
import tray.Tray5;

public class ATM {
    public Tray firstTray;

    public ATM() {
        Tray tray5 = new Tray5();
        Tray tray10 = new Tray10();
        Tray tray20 = new Tray20();

        tray10.setNext(tray5);
        tray20.setNext(tray10);
        this.firstTray = tray20;
    }

    public void process(int amount) {
        firstTray.process(amount);
    }
}