import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String trash = "";
        double firstNumber = 0;
        double secondNumber = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (in.hasNextDouble()){
            firstNumber = in.nextDouble();
            in.nextLine();
            System.out.print("Enter another number: ");
            if (in.hasNextDouble()){
                secondNumber = in.nextDouble();
                if (firstNumber == secondNumber){
                    System.out.println("Your numbers are equal to each other.");
                }
                else if (firstNumber > secondNumber) {
                    System.out.println("Your first number, " + firstNumber + ", is greater than your second number, " + secondNumber + ".");
                }
                else{
                    System.out.println("Your second number, " + secondNumber + ", is greater than your first number, " + firstNumber + ".");
                }
            }
            else {
                trash = in.nextLine();
                System.out.println("Enter a number, not " + trash + ". Try again.");
            }
        }
        else {
            trash = in.nextLine();
            System.out.println("Enter a number, not " + trash + ". Try again.");
        }
    }
}