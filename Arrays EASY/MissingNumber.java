import java.util.*;
public class MissingNumber {
    public static int missingNumber(int a[], int n){
        for(int i=0; i<=n-1; i++){
            if(a[i] != i+1){
                return i+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = {1,2,4,5};
        System.out.print(missingNumber(a, n));
    }
}
