import java.util.Scanner;

public class SwapNums {
    public static void swapNums(int num1, int num2){
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("The swap nums are: \nnum1="+num1+" & num2="+num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 to swap: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number to swap: ");
        int num2 = sc.nextInt();
        swapNums(num1, num2);
        sc.close();
    }    
}
