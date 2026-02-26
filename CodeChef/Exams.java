import java.util.*;
public class Exams {
    	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    String a[] = new String[t];
	    for(int i=0; i<t; i++){
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        int z = sc.nextInt();
	        if(z>(x*y)/2){
	            a[i] = "YES";
	        }
	        else{
	            a[i] = "NO";
	        }
	    }
	    for(int i=0; i<t; i++){
	        System.out.println(a[i]);
	    }

	}
}
