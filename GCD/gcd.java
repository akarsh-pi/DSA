import java.util.*;
public class gcd {
    public static int GCD(int a, int b){
        while(a != b){
            if(a>b){
                a -=b;
            }
            else{
                b-=a;
            }
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(GCD(a,b));
    }
}
