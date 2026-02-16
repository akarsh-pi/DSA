public class Hasharr {
    public static void main(String[] args) {
        int a[] = {1,2,3,1,4,2,1,4};
        int hash[] = new int[12];
        for(int i=0; i<a.length; i++){
            hash[a[i]]++;
        }
        for(int i=0; i<hash.length; i++){
            System.out.println(i + " " + hash[i]);
        }
    }
}
