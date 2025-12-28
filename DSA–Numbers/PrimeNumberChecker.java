// Check whether number is prime

import java.util.Scanner;

public class PrimeNumberChecker {
    public static boolean isPrimeNumber(int num){
        if(num<2){
            return false;
        }
        else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    return false;
                }
            }            
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        
        System.out.println("The "+num+" is prime number = "+isPrimeNumber(num));

        sc.close();
    }
}
