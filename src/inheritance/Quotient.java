package inheritance;

import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int result=0;
        if (number2==0){
            System.out.println("you cannot divide by zero");
        }
        else{
            result = number1 / number2;
        }


        System.out.println(result);
    }
}