import java.util.*;
public class xraisen2 {
    public static int xraisen(int x, int n){
        if(n==1){
            return x;
        }
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        else if(n%2==0){
            return xraisen(x, n/2)*xraisen(x, n/2);
        }
        else{
            return x*xraisen(x, n/2)*xraisen(x, n/2);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.print(xraisen(x,n));
    }
}
