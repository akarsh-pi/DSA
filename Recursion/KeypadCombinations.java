import java.util.Scanner;

public class KeypadCombinations {
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yx"};
    public static void Keypad(String str, int idx, String Combination){
        if(idx == str.length()){
            System.out.println(Combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for(int i=0; i<mapping.length(); i++){
            Keypad(str, idx+1, Combination + mapping.charAt(i));
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Keypad(str, 0, "");
    }
}
