// Program using arithmetic operators

import java.util.Scanner;

public class ArithmeticOperators {
    public static double add(double num1, double num2){
        return num1+num2;
    }

    public static double sub(double num1, double num2){
        return num1-num2;
    }

    public static double mul(double num1, double num2){
        return num1*num2;
    }

    public static double div(double num1, double num2){
        if(num2==0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1/num2;
    }

    public static double mod(double num1, double num2){
        return num1%num2;
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num:");
        double num1 = sc.nextDouble();
        System.out.println("Enter second num: ");
        double num2 = sc.nextDouble();
        System.out.println("Choose operation number: \n 1: Addition, 2: Substraction, 3: Multiplication, 4: Division, 5: Modulus");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("Addition is "+add(num1, num2)); 
                break;
            case 2:
                System.out.println("Subtraction is "+sub(num1, num2)); 
                break;
            case 3:
                System.out.println("Multiplication is "+mul(num1, num2)); 
                break;
            case 4:
                System.out.println("Division is "+div(num1, num2)); 
                break;
             case 5:
                System.out.println("Modulus is "+mod(num1, num2)); 
                break;
            default:
                System.out.println("Wrong option selected!");
                break;
        }
    }    
}
