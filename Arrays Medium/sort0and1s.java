import java.util.*;
public class sort0and1s {
    public static void sort(int a[]){
        int hash[] = new int[3];
        for(int i=0; i<a.length; i++){
            hash[a[i]]+=1;
        }
        int x=0;
        for(int i=0; i<a.length; i++){
            if(hash[x]!=0){
                a[i] = x;
                hash[x]--;
            }
            else{
                a[i] = ++x;
                hash[x]--;
            }
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1, 0, 2, 1, 0};
        sort(a);
    }
}
