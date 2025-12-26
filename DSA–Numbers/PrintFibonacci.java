// Print Fibonacci series

public class PrintFibonacci {
    public static void main(String[] args) {
        int i = 1;
        int num1 = 0;
        int num2 = 1;
        int temp;
        while(i<=20){
            System.out.println(num1);
            temp = num1;
            num1 = num2;
            num2 = temp+num2;
            i++;
        }
    }    
}
