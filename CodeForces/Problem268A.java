import java.util.*;
public class Problem268A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][2];
        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int result=0;
         for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(a[i][0]==a[j][1]){
                    result+=1;
                }
            }
            
        }
        System.out.println(result);
    }
} 

