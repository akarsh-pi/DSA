import java.util.*;
public class ArraySort {
    public static Boolean CheckSort(int a[], int idx){
        if(a[idx+1]>a[idx] && idx==a.length-2){
            return true;
        }
        else if(a[idx]>a[idx+1]){
            return false;
        }
        return CheckSort(a,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for(int i = 0; i<5; i++){
            a[i] = sc.nextInt();
        }
        if(CheckSort(a,0)){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is Not Sorted");
        }
    }
}
