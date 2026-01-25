import java.util.*;
public class name {
    public static void nname(int n){
        if(n==0){
            return;
        }
        else{
            nname(n-1);
        }
        System.out.println("Akarsh");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nname(n);
    }
}
