import java.util.*;
public class NaturalNumbers {
    public static void sum(int i, int n, int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        sum(i+1, n, sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sum(1, n, 0);  
    }
}
