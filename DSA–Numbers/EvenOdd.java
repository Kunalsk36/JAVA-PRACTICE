// Check whether a number is even or odd

import java.util.Scanner;

public class EvenOdd {
    public static void evenOdd(int num){
        if(num%2==0){
            System.out.println("The number: "+num+" is a Even number.");
        }
        else{
            System.out.println("The number: "+num+" is a Odd number.");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        evenOdd(num);
        sc.close();
    }
}
