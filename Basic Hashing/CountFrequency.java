import java.util.*;
//Problem Statement: Given an array, we have found the number of occurrences of each element in the array.
public class CountFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Let's assume that the largest element there can be is 100
        int map[] = new int[100];
        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter the elements in the array: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            map[a[i]]++;
        }
        for(int i=0; i<100; i++){
            System.out.println("No of " + i + " in the array are " + map[i]);
        }

    }
}
