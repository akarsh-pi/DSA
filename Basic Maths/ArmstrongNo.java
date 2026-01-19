import java.util.*;
import java.lang.Math;
//Problem Statement:Given an integer N, return true it is an Armstrong number otherwise return false.
public class ArmstrongNo {
    public static void arm(int n){
        double sum = 0;
        double digit = 0;
        int x = n;
        double count=0;
        while(n>0){
            count++;
            n/=10;
        }
        n=x;
        while(n>0){
            digit = Math.pow(n%10, count);
            sum+=digit;
            n/=10;
        }
        if(sum == x){
            System.out.println("It is an Armstrong number");
        }
        else{
            System.out.println("It is not an Armstrong number");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arm(n);
    }
}
