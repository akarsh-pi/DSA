//Problem Statement: Given an integer N, return all divisors of N.
import java.util.*;
public class PrintDivisors {
    public static void PrintDiv(int n){
        int x=0;
        int count = 0;
        int ndiv[] = new int[n];
        for(int i=1; i<=n; i++){
            if(n%i==0){
                ndiv[x++] = i;
                count++;
            }
        }
        System.out.print("The devisors of " + n + " are: ");
        for(int i=0; i<count; i++){
            System.out.print(ndiv[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintDiv(n);
    }
}
