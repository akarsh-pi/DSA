import java.util.*;
class EMPLOYEE{
    Scanner sc = new Scanner(System.in);
    String Ename;
    int Eid;
    Double Basic;
    Double DA;
    Double Gross_Sal;
    Double Net_Sal;
    void read(){
        System.out.print("Enter name of the Employee: ");
        Ename = sc.next();
        System.out.print("Enter id of the Employee: ");
        Eid = sc.nextInt();
        System.out.print("Enter basic salary of the employee: ");
        Basic = sc.nextDouble();
        DA = 0.52 * Basic;
        Gross_Sal = Basic + DA;
    }

    void compute_net_sal(){
        double IT = 0.3 * Gross_Sal;
        Net_Sal = Gross_Sal - IT;
    }

    void display(){
        System.out.println("Employee Name: " + Ename);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Employee Salary: " + Net_Sal);
    }

}
public class Lab3Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        EMPLOYEE e[] = new EMPLOYEE[n];
        for(int i=0; i<n; i++){
            e[i] = new EMPLOYEE();
            System.out.println("Enter details of Employee " + (i+1) + ": ");
            e[i].read();
            e[i].compute_net_sal();
        }
        for(int i=0;i<n; i++){
            System.out.println("Details of Employee " + (i+1) + ": ");
            e[i].display();
        }

    }
}
