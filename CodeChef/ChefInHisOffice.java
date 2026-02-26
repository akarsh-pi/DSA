import java.util.*;
public class ChefInHisOffice {
    	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    int a[] = new int[t];
	    for(int i=0; i<t; i++){
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        int result = x*4 + y;
	        a[i] = result;
	    }
	    for(int i=0; i<t; i++){
	        System.out.println(a[i]);
	    }
	}
}
