//Problem Statement: Given an integer array nums, rotate the array to the left by one.
import java.util.*;
public class RotateArrayLeft {
    public static void rotateLeft(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
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
        rotateLeft(a);
        for(int i =0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
