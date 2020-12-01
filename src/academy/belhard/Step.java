package academy.belhard;

public class Step {
    private int col;
    private int raw;
    private boolean gamer;

    public Step(boolean gamer) {
        this.gamer = gamer;
    }

    public void fillStep() {
        PositionConsoleReader consoleReader = new PositionConsoleReader();

        raw = consoleReader.getPosition();
        col = consoleReader.getPosition();
    }

    public int getCol() {
        return col;
    }

    public int getRaw() {
        return raw;
    }

    public boolean getGamer() {
        return gamer;
    }
}
