package tray;

public class DefaultTray implements Tray {
    private int billAmount;
    private Tray nextTray;

    DefaultTray(int billAmount) {
        this.billAmount = billAmount;
    }

    @Override
    public void process(int amount) {
        if (nextTray != null) {
            nextTray.process(amount % billAmount);
        } else if (amount % billAmount != 0) {
            throw new IllegalArgumentException("An error happened while processing your money!");
        }
        System.out.println(
                "Successfully processed $" +
                        (amount - amount % billAmount) +
                        " with " +
                        amount / billAmount +
                        " bill(s)."
        );
    }

    @Override
    public void setNext(Tray tray) {
        this.nextTray = tray;
    }
}
