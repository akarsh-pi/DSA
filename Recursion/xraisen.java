import java.util.*;
public class xraisen {
    public static int xraisen(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int c = x * xraisen(x, n-1);
        return c;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x;
    int n;
    x= sc.nextInt();
    n= sc.nextInt();
    System.out.print(xraisen(x, n));
    }
}
