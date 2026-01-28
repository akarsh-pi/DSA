import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i++){
            int smallest = a[i];
            for(int j=i+1; j<n; j++){
                if(a[j]<smallest){
                    smallest = a[j];
                }
            }
            int temp = a[i];
            a[i] = smallest;
            smallest = temp;
        }
        for(int i=0; i<n; i++){
            System.out.print(a[i]+ " ");
        }
    }
 }

    
                                