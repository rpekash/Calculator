import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        System.out.println("Please enter in two whole numbers.");
        Scanner userInput = new Scanner(System.in);
        int numberOne = userInput.nextInt() ;
        int numberTwo = userInput.nextInt() ;
        int sum = numberOne + numberTwo;
        System.out.println(sum);


    }
}