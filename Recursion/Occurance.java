import java.util.*;
public class Occurance {
    public static int first = -1;
    public static int last = -1;
    public static void CountOccur(char a, String str, int x){
        if(x==str.length()){
            System.out.println("The first occurance is at "+ (first+1) + " position");
            System.out.println("The last occurance is at "+ (last+1) + " position");
            return;
        }
        else if(str.charAt(x)==a){
            if(first == -1){
                first = x;
            }
            else{
                last  = x;
            }
        }
        CountOccur(a,str,x+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        CountOccur('a', s, 0);
    }
}
