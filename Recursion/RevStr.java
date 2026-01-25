import java.util.*;
public class RevStr {
    public static StringBuilder Rev(StringBuilder s, int left, int right) {
        if(left>=right){
            return s;
        }
        char temp = s.charAt(left);
        s.setCharAt(left, s.charAt(right));
        s.setCharAt(right, temp);
        return Rev(s, left+1, right-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder str = new StringBuilder(s);
        System.out.println(Rev(str, 0, s.length()-1));
        
    }
}
