import java.util.Scanner;
public class ComputeChange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a dollar amount ex. 11.56");
        String amount = sc.next();
        int dollars = Integer.parseInt(amount.substring(0,amount.indexOf(".")));
        double cents = Double.parseDouble(amount.substring(amount.indexOf(".")));
        double remainder = (cents*100);
        int quarters = (int)(remainder/25);
        remainder = remainder%25;
        int dimes = (int)(remainder/10);
        remainder = remainder%10;
        int nickels = (int)(remainder/5);
        remainder = remainder%5;
        int pennies = (int)remainder;
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + dollars + " dollars");
        System.out.println(" " + quarters + " quarters ");
        System.out.println(" " + dimes + " dimes");
        System.out.println(" " + nickels + " nickels");
        System.out.println(" " + pennies + " pennies");
    }
}
