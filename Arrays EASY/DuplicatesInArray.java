import java.util.*;
public class DuplicatesInArray {
    public static void removeDuplicates(int a[]){
        int newarr[] = new int[a.length];
        int x=0;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    for(int k=0; k<newarr.length; k++){
                        if(a[i] == newarr[k]){
                            break;
                        }
                        else if(a[i]!=newarr[k] && k==newarr.length-1){
                            newarr[x]=a[i];
                            x++;
                            break;
                        }
                    }
                }
            }
        }
        for(int i =0; i<a.length; i++){
            System.out.print(newarr[i] + " "); 
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
        removeDuplicates(a);
    }
}
