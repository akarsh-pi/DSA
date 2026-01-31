//Problem Statement: Given an array, we have to find the largest element in the array.
import java.util.Scanner;
public class LargestElement {
    public static void printArray(int a[]){
        for(int i =0; i<a.length; i++){
            System.out.println(a[i] + " ");
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
        int largest = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]>largest){
                largest = a[i];
            }
        }
        System.out.println("The largest element in the array is: " + largest);

        

    }
}
