import java.util.*;
public class Problem1857A {
    public static boolean Solution(int a[], int n) {
        int odd = 0;
        
        for(int i = 0; i < n; i++) {
            if(a[i] % 2 != 0) {
                odd++;
            }
        }
        
        if(odd%2!=0) {
            return false;
        }
        
        return true;
    }
    public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String sol[] = new String[t];
        for(int f=0;f<t; f++){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            if(Solution(a, n)){
                sol[f] = "YES";
            }
            else{
                sol[f] = "NO";
            }
        }
        for(int i=0; i<t; i++){
            System.out.println(sol[i]);
        }
    }
}
