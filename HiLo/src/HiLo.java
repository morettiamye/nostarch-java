import java.util.Scanner;

public class HiLo {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        String playAgain = "";

        do {
            int randomNumber = (int) (Math.random() * 100 + 1);
            int userGuess = 0;
            int attempts = 0;

            while (userGuess != randomNumber) {
                System.out.println("Please input a random number between 1 and 100: ");
                userGuess = userInput.nextInt();
                System.out.println("You entered: " + userGuess + ".");

                if (userGuess < randomNumber) {
                    System.out.println(userGuess + " is too low.  Try again.");
                    attempts = attempts + 1;
                } else if (userGuess > randomNumber) {
                    System.out.println(userGuess + " is too high.  Try again");
                    attempts = attempts + 1 ;
                } else {
                    attempts = attempts + 1;
                    System.out.println("You guessed correctly! You win!  It took you " + attempts + " tries.");
                }
            }

            System.out.println("Would you like to play again? y/n");
            playAgain = userInput.next();

        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("Thanks for playing! Goodbye!");
        userInput.close();
    }
}
