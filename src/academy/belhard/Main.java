package academy.belhard;

import static academy.belhard.GameResult.*;

public class Main {

    /**
     * 1. Игровое поле
     * 2. Крестики и нолики
     * 3. Игроки
     * 4. Ходы
     * 5. Способ ввода
     * 6. Алгоритм победы
     */

    public static void main(String[] args) {
        GameField gameField = new GameField();
        GameResult gameStatus = NOT_FINISHED;
        boolean gamer = true;
        while (gameStatus == NOT_FINISHED) {
            Step step = new Step(gamer);

            System.out.println("Ход игрока " + GamerSymbolUtil.convert(step.getGamer()));
            step.fillStep();

            boolean marker = gameField.fillCell(step.getGamer(), step.getRaw(), step.getCol());
            gameField.printField();

            gameStatus = gameField.gameFinish();
            if (gameStatus == WINS) {
                System.out.println("ПОБЕДИЛ ИГРОК " + GamerSymbolUtil.convert(step.getGamer()));
            }

            if (gameStatus == DRAW) {
                System.out.println("НИЧЬЯ");
                }
            if (marker) {gamer = !gamer;}
            }
        }
    }

