import java.util.*;
public class Union {
    public static void Union(int a[], int b[]){
         HashSet<Integer> set = new HashSet<>();
         for(int i=0; i<a.length; i++){
            set.add(a[i]);
         }
         for(int i=0; i<b.length; i++){
            set.add(b[i]);
         }
         System.out.print("The union of the Arrays are:");
         for(int i: set){
            System.out.print( i +" ");
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in first array: ");
        int n = sc.nextInt();
        System.out.print("Enter number of elements in second array: ");
        int m = sc.nextInt();
        int a[] = new int[n];
         System.out.print("Enter the elements of 1st Array: ");
        for(int i =0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int b[] = new int[m];
         System.out.print("Enter the elements of 2nd Array: ");
        for(int i =0; i<b.length; i++){
            b[i] = sc.nextInt();
        }
        Union(a, b);
    }
}
