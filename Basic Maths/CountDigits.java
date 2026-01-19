import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        //Problem Statement: Given an integer N, return the number of digits in N.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int count = 0;
        while (n>0){   
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
