// Find largest of three numbers

import java.util.Scanner;

public class LargestOfThreeNums {
    // Method 1: using temp variable
    public static void largestOfThree(int num1, int num2, int num3){
        int temp;
        if(num1>=num2){
           temp = num1;   
        }
        else{
            temp=num2;
        }
        if(temp>=num3){
            System.out.println("Largest number is "+temp);
        }
        else{
            System.out.println("Largest number is "+num3);
        }
    }
    
    // method 2: without using temp variable
    public static void largestOfThreeNums(int num1, int num2, int num3){
        if(num1>=num2 && num1>=num3){
            System.out.println("Largest number is "+num1);
        }
        else if(num2>=num1 && num2>=num3){
            System.out.println("Largest number is "+num2);
        }
        else{
            System.out.println("Largest number is "+num3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int num3 = sc.nextInt();
        System.out.println("Largest number using method 1: ");
        largestOfThree(num1, num2, num3);
        System.out.println("Largest number using method 2: ");
        largestOfThreeNums(num1, num2, num3);
        sc.close();
    }
}
