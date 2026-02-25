import java.util.*;
public class GreaterAverage {
    public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        int sol[] = new int[t];
        for(int i=0; i<t; i++){
            Double a = sc.nextDouble();
            Double b = sc.nextDouble();
            Double c = sc.nextDouble();
            Double avg = (a+b)/2;
            if(avg>c){
                sol[i] = 1;
            }
            else{
                sol[i] = 0;
            }
        }
        for(int i=0; i<t; i++){
            if(sol[i] == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
	}
}
