import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter in two whole numbers.");
        int numberOne = userInput.nextInt() ;
        int numberTwo = userInput.nextInt() ;
        System.out.println("Choose One Operation by entering corresponding number, 1. Addition 2. Subtraction 3. Multiply 4. Divide");
        int operationChoice = userInput.nextInt() ;

        if(operationChoice == 1){
            int sum = numberOne + numberTwo;
            System.out.println(sum);
        }
        else if (operationChoice == 2){
            int sub = numberOne - numberTwo;
            System.out.println(sub);
        }
        else if (operationChoice == 3){
            int multi = numberOne*numberTwo;
            System.out.println(multi);
        }
        else if (operationChoice == 4){
            int divide = numberOne/numberTwo;
            System.out.println(divide);
        }
        

    }
}
