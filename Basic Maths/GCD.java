import java.util.Scanner;
//Problem Statement: Given two integers N1 and N2, find their greatest common divisor.
public class GCD {
    public static int GCD(int n1, int n2){
        int x = 0;
        int y = 0;
        int gcd = 1;
        int n1div[] = new int[n1];
        int n2div[] = new int[n2];
        for(int i=1; i<=n1; i++){
            if(n1%i == 0){
                n1div[x++] = i;
            }
        }
        for(int i=1; i<=n2; i++){
            if(n2%i == 0){
                n2div[y++] = i;
            }
        }
        for(int i=0; i<n1; i++){
            for(int j=0; j<n2; j++){
                if(n1div[i]==n2div[j] && n1div[i]>=gcd){
                    gcd = n1div[i];
                }
            }
        }
        if(gcd == 0){
            gcd = 1;
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(GCD(n1, n2));
        
    }
}
