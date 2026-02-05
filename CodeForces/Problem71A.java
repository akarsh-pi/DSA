import java.util.*;
public class Problem71A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result[] = new String[n];
        for(int i=0; i<n; i++){
            result[i]="";
        }
        for(int i=0; i<n; i++){
            String s = sc.next();
            if(s.length()>10){
                result[i]+=s.charAt(0);
                result[i]+=(s.length()-2);
                result[i]+=s.charAt(s.length()-1);
            }
            else{
                result[i]=s;
            }
        }
        for(int i=0; i<n; i++){
            System.out.println(result[i]);
        }
    }
}
