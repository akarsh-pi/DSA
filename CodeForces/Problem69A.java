import java.util.*;
public class Problem69A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][3];
        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<3; i++){
            int sum=0;
            for(int j=0; j<n; j++){
                sum+=a[j][i];
            }
            if(sum!=0){
                System.out.println("NO");
                break;
            }
            else if(i==2 && sum==0){
                System.out.println("YES");
            }
        }
    }
} 
