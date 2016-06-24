import java.util.Scanner;

/**
 * Created by ubun1604 on 6/23/16.
 */
public class Practice {
    public static void main(String[] args) {
        boolean continueStop = true;
        while (continueStop) {
            System.out.println("Type stop or not");
            Scanner scan = new Scanner(System.in);
            String playHistory = scan.next();
            if (playHistory == "stop") {
                continueStop = false;
            } else {
                continueStop = true;
            }
        }
        System.out.println("end of game");
    }
}
