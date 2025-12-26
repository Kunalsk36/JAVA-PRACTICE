// Check whether number is positive, negative or zero

import java.util.Scanner;

public class PositiveNegativeZeroNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num<0){
            System.out.println("The number: "+num+" is negative.");
        }
        else if(num>0){
            System.out.println("The number: "+num+" is positive.");
        }
        else{
            System.out.println("The number: "+num+" is zero.");
        }
        sc.close();
    }
}
