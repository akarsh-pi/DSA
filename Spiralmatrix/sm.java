import java.util.*;
public class sm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        System.out.print("Enter number of rows in the array: ");
        m = sc.nextInt();
        System.out.print("Enter number of columns in the array: ");
        n = sc.nextInt();
        int a[][] = new int[m][n];
        for(int i=0; i<m; i++){
            System.out.print("Enter elements of "+(i+1)+ " row: ");
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int rowstart = 0;
        int rowend = n-1;
        int colstart = 0;
        int colend = m-1;
        while(rowstart <=rowend && colstart <= colend){
            for(int col=0; col<=colend; col++){
                System.out.print(a[rowstart][col] + " ");
            }
            rowstart++;
            for(int row=0; row<=rowend; row++){
                System.out.print(a[row][colend] + " ");
            }
            colend--;
            for(int col=colend; col>=colstart; col--){
                System.out.print(a[rowend][col] + " ");
            }
            rowend--;;
            for(int row=rowend; row>=rowstart; row--){
                System.out.print(a[row][colstart] + " ");
            }
            colstart++;
            
        }
    }
}
