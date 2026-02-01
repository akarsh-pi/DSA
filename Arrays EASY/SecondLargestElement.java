//Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.
import java.util.*;
public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        if (n < 2) {
            System.out.println("-1");
            return;
        }
        System.out.print("Enter the elements of the Array: ");
        for(int i =0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secondL = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondS = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(a[i]>largest){
                secondL = largest;
                largest = a[i];
            }
            else if(a[i]> secondL && a[i] != largest){
                secondL = a[i];
            }
            if(a[i]<smallest){
                secondS = smallest;
                smallest = a[i];
            }
            else if (a[i] < secondS && a[i] != smallest) {
                secondS = a[i];
            }
        }
        System.out.println("The second smallest element in the array is: " + secondS);
        System.out.println("The second largest element in the array is: " + secondL);
    }
}
