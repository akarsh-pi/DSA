//Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not.
//If the array is sorted then return True, Else return False.
import java.util.*;
public class CheckSorted {
    public static Boolean checkSort(int a[]){
        for(int i=0; i<a.length-1; i++){
            if(a[i]>a[i+1]){
                return false;
            }
        }
        return true;
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
        System.out.println(checkSort(a));
    }
}
