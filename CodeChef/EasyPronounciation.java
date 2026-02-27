import java.util.*;
public class EasyPronounciation {
    public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String a[] = new String[t];
		for(int i=0; i<t; i++){
		    int n = sc.nextInt();
		    String str = sc.next();
		    int count=0;
		    for(int j=0; j<n; j++){
		        char cu=str.charAt(j);
		        if(cu=='a'||cu=='e'||cu=='i'||cu=='o'||cu=='u')
		           count=0;
		        else
		        {   count++;
		            if(count==4)
		             break;
		        }
	        }
	        if(count!=4)
		        a[i] = "YES";
		    else
		        a[i] = "NO";
	    }
	    for(int i=0; i<t; i++){
	        System.out.println(a[i]);
	    }
    }
}
