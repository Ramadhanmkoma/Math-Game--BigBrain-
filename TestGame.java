import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

public class TestGame extends PlayGame {

    public static void main(String[] args) {
        double n1, n2;
        int choice;
        String name;

        Timer timer = new Timer();
        Random randy = new Random();
        Scanner input = new Scanner(System.in);
        TestGame game = new TestGame();
        // PlayGame play = new PlayGame(randy.nextInt(100) * 2, randy.nextInt(10) * 2);

        /* Start Play */
        System.out.print("\t\tWelcome to Math_Games!\n\nPlease Enter your name : ");
        name = input.next();

        System.out.println("\tWelcome " + name + "\n\n\tChoose Your Choice [CHOICE] : ");
        System.out.print(
                " \n\t\t1 Addition \n\t\t2 Substraction \n\t\t3 Multiplication \n\t\t4 Division \n\t\t5 Squares \n\t\t6 Guessing Numbers\n\t\t7 Exit The Game\n[CHOICE] : ");

        PlayGame play2 = new PlayGame();

        choice = input.nextInt();

        switch (choice) {
            
            case 1:
                play2.addition();
                break;

            case 2:
                play2.substraction();
                break;

            case 3:
                play2.multiplication();
                break;

            case 4:
                play2.division();
                break;

            case 5:
                play2.squares();
                break;
            
            case 6:
                play2.guessNumber();
                break;

            default:
                System.out.print(
                        "We couldn't Recognize your choice. Please try again \n\nChoose Your Choice [CHOICE] : ");
                // choice = input.nextInt();
                break;
        }

    }
}
