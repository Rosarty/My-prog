package app;

public class BasicWinning extends Game {
    public BasicWinning(double rate) {
        super(rate);
    }

    public double getWinning() {
        return rate*125/100;
    }
}
