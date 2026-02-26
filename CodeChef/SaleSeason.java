import java.util.*;
public class SaleSeason {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        int a[] = new int[t];
        for(int i=0; i<t; i++){
            int x = sc.nextInt();
            int price = 0;;
            if(x<=100){
                price = x;
            }
            else if(x>100 && x<=1000){
                price = x-25;
            }
            else if(x>1000 && x<=5000){
                price = x-100;
            }
            else if(x>5000){
                price = x-500;
            }
            a[i] = price;
        }
        for(int i=0; i<t; i++){
            System.out.println(a[i]);
        }
	}
}
