public class CharHashing {
    public static void main(String[] args) {
        String a = "abcdacdd";
        int hash[] = new int[26];
        for(int i=0; i<a.length(); i++){
            hash[a.charAt(i)-'a']++;
        }
        for(int i=0; i<a.length(); i++){
            System.out.println(a.charAt(i) + " " + hash[i]);
        }
    }
}
