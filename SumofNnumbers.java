import java.util.Scanner;

public class SumofNnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a  = scanner.nextInt();
        int sum = 0;
        for(int i =1;i<a;i++){
        System.out.println(i + " ");
        sum += i;
        }
    System.out.println("Sum of first N natural numbers" + sum);
    scanner.close();
    }
}

