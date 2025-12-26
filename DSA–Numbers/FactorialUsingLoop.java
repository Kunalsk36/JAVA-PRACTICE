// Find factorial using loop

import java.util.Scanner;

public class FactorialUsingLoop {
    public static int factorial(int num){
        if(num<0){
            System.out.println("The factorial is not define for negative numbers.");
            return -1;
        }
        int result = 1;
        for(int i=2;i<=num;i++){
            result = result*i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int result = factorial(num);
        if(result!=-1){
            System.out.println("The factorial of "+num+" is "+result);
        }
        sc.close();
    }
}
