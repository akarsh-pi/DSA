import java.util.*;
public class Union {
    public static void Union(int a[], int b[]){
        int newarr[] = new int[a.length + b.length+2];
        int x=0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i] == b[j]){
                    newarr[x] = a[i];
                    x++;
                }
                else{
                    newarr[x] = a[i];
                    x++;
                    newarr[x] = b[j];
                    x++;
                }
            }
        }
        System.out.print("The union of two arrays are: ");
        for(int i=0; i<newarr.length; i++){
            System.out.print(newarr[i] + " ");
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
