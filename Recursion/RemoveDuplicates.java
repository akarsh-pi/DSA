import java.util.*;
public class RemoveDuplicates {
    public static boolean map[] = new boolean[26];
    public static String newstr = "";
    public static void RemoveDuplicates(String s, int idx){
        if(idx==s.length()){
            System.out.println(newstr);
            return;
        }
        char currchar = s.charAt(idx);
        if(map[currchar - 'a']){
            RemoveDuplicates(s, idx+1);
        }
        else{
            map[currchar - 'a'] = true;
            newstr+=currchar;
            RemoveDuplicates(s, idx+1);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        RemoveDuplicates(s,0);
    }
}
