// print prime numbers between 1 to 100:

public class PrintPrimeNumbers {
    public static void printPrimeNumbers(){
        for(int i=2;i<=100;i++){
            boolean isPrimeNumber = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrimeNumber = false;
                    break;
                }
            }
            if(isPrimeNumber){
                System.out.println(i);
            }
        }
        
    }
    public static void main(String[] args) {
        printPrimeNumbers();
    }
}
