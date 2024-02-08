import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter in two whole numbers.");
        int numberOne = userInput.nextInt() ;
        int numberTwo = userInput.nextInt() ;
        System.out.println("Choose One Operation by entering corresponding number, 1. Addition 2. Subtraction");
        int operationChoice = userInput.nextInt() ;

        if(operationChoice == 1){
            int sum = numberOne + numberTwo;
            System.out.println(sum);
        }
        else{
            int sub = numberOne - numberTwo;
            System.out.println(sub);
        }
        

    }
}
