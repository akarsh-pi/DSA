import java.util.*;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number of rows: ");
        n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
