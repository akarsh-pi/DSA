import java.util.*;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number of rows: ");
        n = sc.nextInt();
        int x;
        x=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
    }
    
}
