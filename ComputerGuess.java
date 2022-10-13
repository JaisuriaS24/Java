import java.util.Scanner;

public class ComputerGuess { 
    public static void main(String[]  args) {
        
        Scanner scanner = new
        Scanner(System.in);
        System.out.print("Please type a number from 1 to 100:  ");

        int secretNum = scanner.nextInt();
        scanner.close();
        boolean guessCorrect = false;
        int botGuess = 50;
        int lowGuess = 1;
        int highGuess = 100;

        while(!guessCorrect)
        {
            if(botGuess == secretNum) {
                System.out.println("I got it!");
                System.out.println("DEBUG: botGuess=" + botGuess);
                guessCorrect = true;
            }
            else if (botGuess > secretNum) {
                System.out.println("Uh oh, I got it too high! My guess was " + botGuess);
                highGuess = botGuess;
                botGuess = (highGuess+lowGuess)/2;
            }
            else if (botGuess < secretNum) {
                System.out.println("Uh oh, I got it too low! My guess was " + botGuess);
                lowGuess = botGuess;
                botGuess = (highGuess+lowGuess)/2;
            }
            else {

                System.out.println("Huh??? How did we get here?");
                System.out.println("DEBUG: botGuess=" + botGuess);
            }
        }

    } 
    
}
