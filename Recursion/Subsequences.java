import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
public class Subsequences {
    public static void Subsequences(String str, int idx, String newstr,HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newstr)){
                return;
            }
            else{
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }
        char currChar = str.charAt(idx);
        //to be
        Subsequences(str, idx+1, newstr+currChar, set);
        //to not be
        Subsequences(str, idx+1, newstr, set);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<String> set = new HashSet<>();
        Subsequences(str, 0, "",set);
    }
}
