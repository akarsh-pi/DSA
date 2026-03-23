import java.util.*;
class STUDENT{
    Scanner sc = new Scanner(System.in);
    String sname;
    int marks_array[];
    double total;
    double avg;
    
    void assign(){
        System.out.print("Enter name of the student: ");
        this.sname = sc.next();
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        this.marks_array = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter marks in Subject " +  (i+1) + ": ");
            this.marks_array[i] = sc.nextInt();
        }
    }

    void compute(){
        for(int i=0; i<this.marks_array.length; i++){
            this.total += marks_array[i];
        }
        this.avg = total/marks_array.length;
    }

    void display(){
        System.out.println("Name of the student : " + this.sname);
        for(int i=0; i<this.marks_array.length; i++){
            System.out.println("Marks in Subject " + (i+1) + ": " + this.marks_array[i]);
        }
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }
}
public class Lab3Q1 {
    public static void main(String[] args) {
        STUDENT s1 = new STUDENT();
        s1.assign();
        s1.compute();
        s1.display();
    }
}
