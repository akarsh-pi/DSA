import java.util.*;
public class fibo {
    public static void fibo(int n){
        int x1=0;
        int x2=1;
        int x3=x1+x2;
        for(int i = 1; i <= n; i++){
            if(i==1){
                System.out.print(0 + " ");
            }
            else if(i==2){
                System.out.print(1 + " ");
            }
            else{
                System.out.print(x3 + " ");
                x1=x2;
                x2=x3;
                x3=x1+x2;
            }

        }
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();
    fibo(n);
    }
}
