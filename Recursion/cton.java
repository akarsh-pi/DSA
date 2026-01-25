import java.util.*;
public class cton {
    public static void cton(int n, int c){
        if(c==n){
            System.out.print(c + ", ");
            return;
        }
        System.out.print(c + ", ");
        cton(n, c+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        cton(n,1);
    }
}
