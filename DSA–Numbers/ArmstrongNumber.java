// Check Armstrong number

import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrongNumber(int num){
        int pow = String.valueOf(num).length();
        double sum = 0;
        int temp = num;
        while(num>0){
            int digit = num%10;
            sum = sum+Math.pow(digit, pow);
            num /= 10;
        }
        return sum==temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        int num = sc.nextInt();
        System.out.println("The number "+num+" is a armstrong number = "+isArmstrongNumber(num));
        sc.close();
    }
}
