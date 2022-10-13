public class FizzBuzz {
    public static void main(String args[]) {
        int n = 200; //Set the parameter to 200
        String num;
    
        for (int i=1; i<=n; i++)
        {
            num = Integer.toString(i);
            if (i%15==0)
              System.out.println("FizzBuzz");  // If number is divisible by 3 or 5, it will print "FizzBuzz"   
    
            else if (i%5==0)
              System.out.println("Buzz"); // If number is divisible by 5, it will print "Buzz"
        
            else if (i%3==0)
              System.out.println("Fizz"); // If number is divisible by 3, it will brint "Fizz"
    
            else if (i%3 !=0 && num.contains("3")) {
            num=num.replace("3", "Fizz");  // If number is not divisible by 3, but has a 3 in it, it will replace the 3 with the word "Fizz"
            System.out.println(num); 
            }

            else
            System.out.println(i); // IF number is not divisble by 3 and doesn't have 3 in it, it will print the number
            }
        }
    }
