package app;

public class MegaWinning extends Game {
    public MegaWinning(double rate) {
        super(rate);
    }

    public double getWinning() {
        double win = 2 * rate;
        return ((win * 125 / 100) * 90 / 100);
    }
}
