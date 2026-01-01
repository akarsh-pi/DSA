import java.util.*;
class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        System.out.print("Enter number of rows: ");
        n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        m = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i==1 || i==n){
                for(int j=1; j<=m; j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int k=1; k<=m; k++){
                    if(k==1 || k==m){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.print("\n");
        }
    }
}


