// Find nth Fibonacci number

import java.util.Scanner;

public class NthFibonacciNumber {
    public static void nthFibonacciNumber(int n){
        int result = 0;
        int first = 0;
        int second = 1;
        int temp;
        for(int i=1;i<=n;i++){
            result = first;
            temp = first;
            first = second;
            second = temp+second;
        }
        System.out.println("The nth number in fibonacci is: "+result);
    }
    
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the Nth number: ");
        int n = sc.nextInt();
        nthFibonacciNumber(n);
        sc.close();
    }
}
