import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter in two numbers.");
        float numberOne= userInput.nextFloat();
        float numberTwo= userInput.nextFloat();
        System.out.println("Choose One Operation by entering corresponding number, 1. Addition 2. Subtraction 3. Multiply 4. Divide");
        int operationChoice = userInput.nextInt() ;

        if(operationChoice == 1){
            float sum = numberOne + numberTwo;
            System.out.println(sum);
        }
        else if (operationChoice == 2){
            float sub = numberOne - numberTwo;
            System.out.println(sub);
        }
        else if (operationChoice == 3){
            float multi = numberOne*numberTwo;
            System.out.println(multi);
        }
        else if (operationChoice == 4){
            float divide = numberOne/numberTwo;
            System.out.println(divide);
        }
        

    }
}
