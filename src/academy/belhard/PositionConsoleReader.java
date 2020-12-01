package academy.belhard;

import java.util.Scanner;

public class PositionConsoleReader implements PositionReader {

    @Override
    public int getPosition() {

           Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }

}
