import java.util.*;
public class Revnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Problem Statement: Given an integer N return the reverse of the given number.
        int n = sc.nextInt();
        int rev = 0;
        int digit = 0;
        while(n>0){
            digit = n%10;
            rev = (rev*10) + digit;
            n=n/10;
        }
        System.out.println(rev);
    }       
}
