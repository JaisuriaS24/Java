import java.math.BigInteger;

public class Factorials {
   public static void main (String[] args) {
      //1*2*3*4

      for (int i = 0; i < 101; i++) {
         System.out.println("Factorial for " + i + " " + "is" + " " + factoring(i)); // This command executes "Factorial for set number is ...."
      }
   }
   
   public static BigInteger factoring(int i) {

      BigInteger factorial = new BigInteger("1");
      for (int k = i; k > 0; k--) {
         factorial=factorial.multiply(BigInteger.valueOf(k));
      }
      
      return(factorial);
   }
}