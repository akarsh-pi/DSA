import java.util.*;
public class Subscribtion {
    public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    int sol[] = new int[t];
	    for(int i=0; i<t; i++){
	        int n = sc.nextInt();
	        int x = sc.nextInt();
	        int nos = 0;
	        if(n%6==0){
	            nos = n/6;
	        }
	        else{
	            nos = n/6 + 1;
	        }
	        int cost = nos * x;
	        sol[i] = cost;
	   }
	   for(int i=0; i<t; i++){
	        System.out.println(sol[i]);
	   }
     }
}
