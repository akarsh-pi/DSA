import java.util.*;
public class backward {
    public static void backward(int n){
        if(n==1){
            System.out.print(n + ", ");
            return;
        }
        System.out.print(n+ ", ");
        backward(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        backward(n);
    }
}
