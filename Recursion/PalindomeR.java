import java.util.*;
public class PalindomeR {
    public static boolean pd(String s, int left, int right){
        if(left>=right){
            return true;
        }
        else if(s.charAt(left)!= s.charAt(right)){
            return false;
        }
        return pd(s, left+1, right-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(pd(s,0,s.length()-1)){
            System.out.println("It is a Palindrome!");
        }
        else{
            System.out.println("Not a palindrome");
        }
        
    }
}
