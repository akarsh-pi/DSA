import java.util.*;
public class WaterFilling {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        String sol[] = new String[t];
        for(int j=0; j<t; j++){
            int b[] = new int[3];
            int count=0;
            for(int i=0; i<3; i++){
                b[i] = sc.nextInt();
            }
            for(int i=0; i<3; i++){
                if(b[i]==0){
                    count++;
                }
            }
            if(count>=2){
                sol[j] = "Water filling time";
            }
            else{
                sol[j] = "Not now";
            }
        }
        for(int i=0; i<t; i++){
            System.out.println(sol[i]);
        }
	}
}
