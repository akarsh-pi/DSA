//Problem Statement: Given an integer N, check whether it is prime or not. A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2..
import java.util.*;
public class CheckPrime {
    public static void CheckPrime(int n){
        for(int i=2; i<=n; i++){
            if(n%i==0 && i!=n){
                System.out.println(n + " is not a prime number");
                break;
            }
            else if(i==n){
                System.out.println(n + " is a prime number");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CheckPrime(n);
    }
}
