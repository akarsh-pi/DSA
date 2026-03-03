import java.util.*;
public class Problem2182B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int a = sc.nextInt(); 
            int b = sc.nextInt(); 

            System.out.println(Math.max(solve(a, b, true),
                                        solve(a, b, false)));
        }
    }

    public static int solve(int a, int b, boolean startWhite) {
        long white = 0, dark = 0;
        int layers = 0;
        long size = 1;

        while(true) {
            if(startWhite) {
                if(layers % 2 == 0) white += size;
                else dark += size;
            } else {
                if(layers % 2 == 0) dark += size;
                else white += size;
            }

            if(white > a || dark > b) break;

            layers++;
            size *= 2;
        }

        return layers;
    }
}
