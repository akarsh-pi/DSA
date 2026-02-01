import java.util.*;
public class RotateArrayKele {
    public static void rotateLeft(int arr[], int steps){
        for(int j=0; j<steps; j++){
            for(int i=0; i<arr.length-1; i++){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

    }
    public static void rotateRight(int arr[], int steps){
        for(int j=0; j<steps; j++){
            for(int i=arr.length-1; i>0; i--){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
        }

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
        System.out.print("Enter number of elements you want to rotate: ");
        int steps = sc.nextInt();
        System.out.print("Enter the direction you want to rotate (0-right, 1-left): ");
        int rotation = sc.nextInt();
        if(rotation == 0){
            rotateRight(a, steps);
        }
        else if(rotation == 1){
            rotateLeft(a, steps);
        }
        for(int i =0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
