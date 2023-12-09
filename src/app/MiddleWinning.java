package app;

public class MiddleWinning extends Game {
    public MiddleWinning(double rate) {
        super(rate);
    }

    public double getWinning() {
        return ((rate * 125 / 100) * 95 / 100);
    }
}
