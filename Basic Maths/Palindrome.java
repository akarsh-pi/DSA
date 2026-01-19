import java.util.*;
public class Palindrome {
    public static int Rev(int n){
        int rev = 0;
        int digit = 0;
        while(n>0){
            digit = n%10;
            rev = (rev*10) + digit;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Problem Statement: Given an integer N, return true if it is a palindrome else return false.
        int n = sc.nextInt();
        if(Rev(n) == n){
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }
        

    }
}
