import java.util.*;
public class MoveCharAtEnd {
    public static int count = 0;
    public static String newstr = "";
    public static void AtEnd(String s, char c, int a){
        if(a==s.length()){
            for(int i=0; i<count; i++){
                newstr+=c;
            }
            System.out.println(newstr);
            return;
        }
        else if(s.charAt(a)==c){
            count++;
            AtEnd(s, c, a+1);
        }
        else{
             newstr += s.charAt(a);
             AtEnd(s, c, a+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.next().charAt(0);
        AtEnd(s,c,0);
    }
}
