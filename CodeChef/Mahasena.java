import java.util.*;
public class Mahasena {
    public static void main (String[] args) throws java.lang.Exception{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int a[] = new int[n];
	    for(int i=0; i<n; i++){
	        a[i] = sc.nextInt();
	    }
	    int lcount=0;
	    int ucount=0;
	    for(int i=0; i<n; i++){
	        if(a[i]%2==0){
	            lcount++;
	        }
	        else{
	            ucount++;
	        }
	    }
	    if(lcount>ucount){
	        System.out.println("READY FOR BATTLE");
	    }
	    else{
	        System.out.println("NOT READY");
	    }
	}
}
