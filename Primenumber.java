import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = scanner.nextInt();
        for(int i = 0;i<=a;i++){
            if(isPrime(i)){
                System.out.print(i +" ");
            }
        }
    }
    public static boolean isPrime(int n){
        if(n<=1) 
        return false;
        for(int i = 2;i<=Math.sqrt(n);i++){
            if (n % i == 0) {
                return false; 
            }
        }
        return true;
    }
}
