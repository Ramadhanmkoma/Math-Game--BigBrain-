import java.util.Scanner;
import java.util.Random;
import java.util.Timer;

public class PlayGame implements Operators {

    int num1, num2;
    String again;

    Timer timer = new Timer();
    Random rand = new Random();

    public PlayGame(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public PlayGame() {
        num1 = rand.nextInt(100) * 2;
        num2 = rand.nextInt(10) * 2 + 1;
    }

    // DIV
    public void division() {
        int points = 0;
        double ans = 0;
        double answer = (double) (num1) / num2;
        Scanner inp = new Scanner(System.in);

        while (true) {

            for (int count = 1; count <= 5; count++) {
                System.out.println("\nQuestion " + count);
                num1 = rand.nextInt(100) * 2;
                num2 = rand.nextInt(10) * 2 + 1;
                answer = (double) (num1) / num2;
                System.out.println(num1 + " / " + num2 + " = ");
                System.out.print("Answer : ");
                ans = inp.nextDouble();

                if (answer == ans) {
                    points += 20;
                    System.out.println(String.format(
                            "Correct! The Answer is : %3f \t You Have got %d point. Keep going  Points = %d", answer,
                            points, points));
                } else {
                    System.out.println(
                            String.format("Oops! Wrong Answer! The Answer is : %3f \t Points = %d", answer, points));

                }

            } // end for
            System.out.print("Your Total Marks is " + points + "\n \t Do you want to play Again? (Y/N): ");

            // EXCEPTIONS
            try {
                again = inp.next();
                if (again.equals("Y") || again.equals("y") || again.equals("YES") || again.equals("yes")
                        || again.equals("Yes")) {
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    continue;
                } else if (again.equals("N") || again.equals("n") || again.equals("NO") || again.equals("no")
                        || again.equals("No")) {
                    System.out.println();
                    System.out.println("\tThanks for playing!");
                    break;
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                // TODO: handle exception
                System.err.println("We couldn't recognize your choice! GAME OVER");
                break;
            }

        } // end while
    } // end of division

    // MULT
    public void multiplication() {
        int points = 0;
        double ans = 0;
        int answer = num1 * num2;
        Scanner inp = new Scanner(System.in);

        while (true) {

            for (int count = 1; count <= 5; count++) {
                System.out.println("\nQuestion " + count);
                num1 = rand.nextInt(10) * 2;
                num2 = rand.nextInt(10) * 2;
                answer = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = ");
                System.out.print("Answer : ");
                ans = inp.nextInt();

                if (answer == ans) {
                    points += 20;
                    System.out.println("\033[H\033[2J");
                    System.out.println(String.format(
                            "Correct! The Answer is : %d \t You Have got %d point. Keep going  Points = %d", answer,
                            points, points));
                } else {
                    System.out.println(
                            String.format("Oops! Wrong Answer! The Answer is : %d \t Points = %d", answer, points));

                }

            } // end for
            System.out.print("Your Total Marks is " + points + "\n \t Do you want to play Again? (Y/N): ");
            try {
                again = inp.next();
                if (again.equals("Y") || again.equals("y") || again.equals("YES") || again.equals("yes")
                        || again.equals("Yes")) {
                    System.out.println();
                    System.out.println();
                    System.out.println("\033[H\033[2J");
                    continue;
                } else if (again.equals("N") || again.equals("n") || again.equals("NO") || again.equals("no")
                        || again.equals("No")) {
                    System.out.println();
                    System.out.println("\tThanks for playing!");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.err.println("We couldn't recognize your choice! GAME OVER");
                break;
            }

        } // end while
    }

    // ADD
    public void addition() {
        int points = 0;
        double ans = 0;
        int answer = num1 + num2;
        Scanner inp = new Scanner(System.in);

        while (true) {

            for (int count = 1; count <= 5; count++) {
                System.out.println("\nQuestion " + count);
                num1 = rand.nextInt(20);
                num2 = rand.nextInt(10) * 2;
                answer = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = ");
                System.out.print("Answer : ");
                ans = inp.nextInt();

                if (answer == ans) {
                    points += 20;
                    System.out.println("\033[H\033[2J");
                    System.out.println(String.format(
                            "Correct! The Answer is : %d \t You Have got %d point. Keep going  Points = %d", answer,
                            points, points));
                } else {
                    System.out.println(
                            String.format("Oops! Wrong Answer! The Answer is : %d \t Points = %d", answer, points));

                }

            } // end for
            System.out.print("Your Total Marks is " + points + "\n \t Do you want to play Again? (Y/N): ");
            try {
                again = inp.next();
                if (again.equals("Y") || again.equals("y") || again.equals("YES") || again.equals("yes")
                        || again.equals("Yes")) {
                    System.out.println();
                    System.out.println();
                    System.out.println("\033[H\033[2J");
                    continue;
                } else if (again.equals("N") || again.equals("n") || again.equals("NO") || again.equals("no")
                        || again.equals("No")) {
                    System.out.println();
                    System.out.println("\tThanks for playing!");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.err.println("We couldn't recognize your choice! GAME OVER");
                break;
            }

        } // end while
    } /* END ADD */

    // SUB
    public void substraction() {
        int points = 0;
        double ans = 0;
        int answer = num1 - num2;
        Scanner inp = new Scanner(System.in);

        while (true) {

            for (int count = 1; count <= 5; count++) {
                System.out.println("\nQuestion " + count);
                num1 = rand.nextInt(10) * 2;
                num2 = rand.nextInt(10) * 2;
                answer = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = ");
                System.out.print("Answer : ");
                ans = inp.nextInt();

                if (answer == ans) {
                    points += 20;
                    System.out.println("\033[H\033[2J");
                    System.out.println(String.format(
                            "Correct! The Answer is : %d \t You Have got %d point. Keep going  Points = %d", answer,
                            points, points));
                } else {
                    System.out.println(
                            String.format("Oops! Wrong Answer! The Answer is : %d \t Points = %d", answer, points));

                }

            } // end for
            System.out.print("Your Total Marks is " + points + "\n \t Do you want to play Again? (Y/N): ");
            try {
                again = inp.next();
                if (again.equals("Y") || again.equals("y") || again.equals("YES") || again.equals("yes")
                        || again.equals("Yes")) {
                    System.out.println();
                    System.out.println();
                    System.out.println("\033[H\033[2J");
                    continue;
                } else if (again.equals("N") || again.equals("n") || again.equals("NO") || again.equals("no")
                        || again.equals("No")) {
                    System.out.println();
                    System.out.println("\tThanks for playing!");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.err.println("We couldn't recognize your choice! GAME OVER");
                break;
            }

        } // end while
    } /* END SUB */

    // SQUARES
    public void squares() {
        int points = 0;
        double ans = 0;
        double answer = Math.pow((double) num1, 2);
        Scanner inp = new Scanner(System.in);

        while (true) {

            for (int count = 1; count <= 5; count++) {
                System.out.println("\nQuestion " + count);
                num1 = rand.nextInt(10) * 2;
                // num2 = rand.nextInt(10) * 2;
                answer = Math.pow(num1, 2);
                System.out.println("What is the Square of : " + num1 + " ? ");
                System.out.print("Answer = ");
                ans = inp.nextInt();

                if (answer == ans) {
                    /*
                     * JFrame frame = new JFrame(); frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                     * frame.setVisible(true); frame.setTitle("Math_Game");
                     * frame.setBackground(Color.GREEN);
                     */
                    points += 20;
                    System.out.println(String.format(
                            "Correct! The Answer is : %f \t You Have got %d point. Keep going  Points = %d", answer,
                            points, points));
                } else {
                    System.out.println(
                            String.format("Oops! Wrong Answer! The Answer is : %f \t Points = %d", answer, points));

                }

            } // end for
            System.out.print("Your Total Marks is " + points + "\n \t Do you want to play Again? (Y/N): ");
            try {
                again = inp.next();
                if (again.equals("Y") || again.equals("y") || again.equals("YES") || again.equals("yes")
                        || again.equals("Yes")) {
                    System.out.println();
                    System.out.println();
                    System.out.println("\033[H\033[2J");
                
                    continue;
                } else if (again.equals("N") || again.equals("n") || again.equals("NO") || again.equals("no")
                        || again.equals("No")) {
                    System.out.println();
                    System.out.println("\tThanks for playing!");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.err.println("We couldn't recognize your choice! GAME OVER");
                break;
            }

        } // end while
    } /* END SQUARES */

    // GUESS NUMBER
    public void guessNumber() {
        Scanner inp = new Scanner(System.in);
        num1 = 1 + (int) (20 * Math.random());

        // Given K
        int K = 5;

        int i, guess;

        System.out.println("A number is chosen" + " between 1 to 20." + "Guess the number" + " within 5 trials.");

        // Interate over K Trials
        for (i = 0; i < K; i++) {

            System.out.print("Guess the number : ");

            // Take input for guessing
            guess = inp.nextInt();

            // If the number is guessed
            if (num1 == guess) {
                System.out.println("Congratulations!" + " You guessed the number.");
                break;
            } else if (num1 > guess && i != K - 1) {
                System.out.println("The number is " + "greater than " + guess);
            } else if (num1 < guess && i != K - 1) {
                System.out.println("The number is" + " less than " + guess);
            }
        }

        /* if (i == K) {
            System.out.println("You have exhausted" + " K trials.");

            System.out.println("The number was " + num1);
        } */
    }

}
