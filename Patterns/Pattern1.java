import java.util.*;
public class Pattern1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number of rows: ");
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<5; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}
