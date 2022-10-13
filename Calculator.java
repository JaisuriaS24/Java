import java.util.Scanner;

public class Calculator {
   
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in); //scanner

      System.out.print("Please input the first number: "); // recieve numbers
      double firstnum = scanner.nextDouble();
      System.out.print("Please input the second number: ");
      double secondnum = scanner.nextDouble();
      System.out.println("Second number = " + secondnum);

            boolean validprompt = false; // recieve operation 
            String operation = "DEBUG";
            while (!validprompt) {
               System.out.print("Please input the operation (+,-,*,/)  ");
               String i = scanner.next();
               switch (i) {
                  case "+":
                     operation = "+";
                     validprompt=true;
                     System.out.println("You chose" + operation);
                     break;

                     case "-":
                     operation = "-";
                     validprompt=true;
                     System.out.println("You chose " + operation);
                     break;

                     case "*":
                     operation = "*";
                     validprompt=true;
                     System.out.println("You chose " + operation);
                     break;

                     case "/":
                     operation = "/";
                     validprompt=true;
                     System.out.println("You chose " + operation);
                     if (secondnum == 0) {
                        throw new ArithmeticException("Cannot divide by zero");
                        }
                     break;

                     default:
                        System.out.println("Try again.");
                        break;
               }
            }

            scanner.close();

            System.out.println(firstnum + " " + operation + " " + secondnum + " = " + calculate(firstnum, secondnum, operation));
         }

         public static double calculate(double num1, double num2, String operator) {
            switch (operator) {
               case "+": return num1+num2;
               case "-": return num1-num2;
               case "*": return num1*num2;
               case "/": return num1/num2;
               default:
                     System.exit(1);
                     return -1;
      
            }
         }

   }
