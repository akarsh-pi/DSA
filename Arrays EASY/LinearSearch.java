import java.util.Scanner;

public class LinearSearch {
    public static int LinearSearch(int a[], int key){
        for(int i=0; i<a.length; i++){
            if(a[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
         System.out.print("Enter the elements of the Array: ");
        for(int i =0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the element you are searching for: ");
        int key = sc.nextInt();
        System.out.println(LinearSearch(a, key));
    }
}
