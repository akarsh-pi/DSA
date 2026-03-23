import java.util.Scanner;
class Mixer{
    Scanner sc = new Scanner(System.in);
    int arr[];
    void accept(){
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();
        this.arr = new int[n];
        System.out.print("Enter the elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
    }

    Mixer mix(Mixer A){
        Mixer merged = new Mixer();
        merged.arr = new int[this.arr.length + A.arr.length];
        for(int i=0; i<this.arr.length; i++){
            merged.arr[i] = this.arr[i];
        }
        for(int i=0; i<A.arr.length; i++){
            merged.arr[this.arr.length + i] = A.arr[i];
        }
        for(int i=0; i<merged.arr.length-1; i++){
            for(int j=i+1; j<merged.arr.length; j++){
                if(merged.arr[j]<merged.arr[i]){
                    int temp = merged.arr[j];
                    merged.arr[j] = merged.arr[i];
                    merged.arr[i] = temp;
                }
            }
        }
        return merged;
    }

    void display(){
        System.out.print("The elements of the array are: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

public class Lab3Q3 {
    public static void main(String[] args) {
        Mixer a = new Mixer();
        a.accept();
        Mixer b = new Mixer();
        b.accept();
        Mixer result = a.mix(b);
        System.out.print("Elements in ascending order: ");
        result.display();
    }
}
