import java.util.Random;
import java.util.Scanner;
 
public class HumanGuess {
 
   public static void main(String[] args) {
 
      Random random = new Random();
      Scanner scanner = new Scanner(System.in);
 
      int number = random.nextInt(100)+1;
      int guess = -1;
      int count=0;
 
      while (guess!=number) {
         count=count+1;
         System.out.print("Enter a number between 1 and 100: "); //Input a number between 1 and 100
         guess = scanner.nextInt();
         if (guess<number) {
            System.out.println("Too low, please try again"); //If number that is guessed is too low, it will print this statement
         } else if (guess>number) {
            System.out.println("Too high, please try again"); //If number that is guessed is too high, it will print this statement
         } else {
            System.out.println("Correct, the number was " + number); //If number that is guessed is correct, it will print this statement
         }
      }
      System.out.println("It took you " + count + " trys."); //If number that is guessed is correct, it will mention how many attempts the person took
      scanner.close();
   
    }

}
