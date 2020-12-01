package academy.belhard;

public class GameField {
    private final static int FIELD_SIZE = 3;
    private Boolean[][] field;

    public GameField() {
        field = new Boolean[FIELD_SIZE][FIELD_SIZE];
    }

    public boolean fillCell(boolean value, int raw, int col) {
        if (raw<0 || raw>=FIELD_SIZE || col<0 || col>=FIELD_SIZE) {
            System.out.println("Введите значения от 0 до " + (FIELD_SIZE-1));
            return false;
        }

        if (field[raw][col] == null) {
            field[raw][col] = value;
            return true;
        }
        else {
            System.out.println("Ячейка уже занята, повторите ход");
            return false;
        }
    }


    public void printField() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {

                String symbol = GamerSymbolUtil.convert(field[i][j]);

                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
    public GameResult gameFinish() {
        if ( field [0][0]== field [1][0] && field [1][0]== field [2][0] && field [2][0]!=null ||
             field [0][1]== field [1][1] && field [1][1]== field [2][1] && field [2][1]!=null ||
             field [0][2]== field [1][2] && field [1][2]== field [2][2] && field [2][2]!=null ||
             field [0][0]== field [0][1] && field [0][1]== field [0][2] && field [0][2]!=null ||
             field [1][0]== field [1][1] && field [1][1]== field [1][2] && field [1][2]!=null ||
             field [2][0]== field [2][1] && field [2][1]== field [2][2] && field [2][2]!=null ||
             field [0][0]== field [1][1] && field [1][1]== field [2][2] && field [2][2]!=null ||
             field [2][0]== field [1][1] && field [1][1]== field [0][2] && field [0][2]!=null )  {

            return GameResult.WINS;
        }
        else  if (field [0][0]!= null && field [1][0] != null && field [2][0]!= null &&
                  field [0][1]!= null && field [1][1] != null && field [2][1] != null &&
                  field [0][2]!= null && field [1][2] != null && field [2][2]!= null) {
            return GameResult.DRAW;
        }
        return GameResult.NOT_FINISHED;
    }

}
