import java.util.*;
public class Problem486A {
    public static int fofn(int n){
        int result=0;
        for(int i=1; i<=n; i++){
            if(i%2==0){
                result+=i;
            }
            else{
                result-=i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fofn(n));
    }
}
