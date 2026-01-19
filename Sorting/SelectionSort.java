import java.util.*;
public class SelectionSort {
    public static void printArray(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number of elements in the array: ");
        n = sc.nextInt();
        int a[]= new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int smallest=a[0];
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(a[i]>a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        printArray(a);
    }
}
