import java.util.Scanner;

public class MakeChange {
    public static void main(String[] args) {
        boolean moreItems= true;
        double cost = 0;
        Scanner scanner = new Scanner(System.in);
        double i = 0;
        while(moreItems) {
            System.out.println("Please enter below how much the current item costs, or enter 0 if done.");
            i = scanner.nextDouble();
            if (i == 0.0) moreItems=false;
            else cost = cost+i;
        }
        System.out.println("The total cost is: " + cost);
        //scanner.close();
        //step 2
        double customerGive = 0;
        System.out.println("Please input the amount that the customer has given: ");
        customerGive = scanner.nextDouble();
        scanner.close();

        //step 3
        double change = customerGive-cost;
        System.out.println("The change needed is: " + change);
        if (change > 0) change =  
        changeCOnvert(change, 100);
        if(change > 0) change =
        changeCOnvert(change, 50);
        if (change > 0) change = 
        changeCOnvert(change, 20);
        if (change > 0) change = 
        changeCOnvert(change, 10);
        if (change > 0) change = 
        changeCOnvert(change, 5);
        if (change > 0) change =
        changeCOnvert(change, 1);
        if (change > 0) change = 
        changeCOnvert(change, 0.25);
        if (change > 0) change =
        changeCOnvert(change, 0.10);
        if (change > 0) change = 
        changeCOnvert(change, 0.05);
        if (change > 0) change = 
        changeCOnvert(change, 0.01);
    }

    public static double changeCOnvert(double changeamt, double changebill) {
        int changeinpennies = (int)(changeamt*100);
        int changebillinpennies = (int)(changebill*100);
        if (changeinpennies/changebillinpennies<1) 
        return changeamt;

        if (changebillinpennies>=100) {
            System.out.println("Give the customer " + changeinpennies/changebillinpennies + "x" + (int)changebill + "dollar bills.");
        } else {
            System.out.println("Give the customer " + changeinpennies/changebillinpennies + "x" + (int)(changebill*100) + " cent coins.");
        }
        double i = (changeinpennies%changebillinpennies)/100.0;
        return i;
        }


    }
