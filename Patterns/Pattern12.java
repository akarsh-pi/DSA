import java.util.*;
public class Pattern12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number of rows: ");
        n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j=i; j>1; j--){
                System.out.print(j);
            }
            for(int x=1; x<=i; x++){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
