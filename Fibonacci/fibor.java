import java.util.*;
public class fibor {
    public static void fibor(int a, int b, int n){
        if(n==0){
            return;
        }
        int c  = a + b;
        System.out.print(c + " ");
        fibor(b, c, n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.print(0 + " ");
        System.out.print(1 + " ");
        fibor(0, 1, n-2); 
    }
}
