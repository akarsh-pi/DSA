import java.util.*;
public class CountOnes {
    public static int countOnes(int a[]){
        int maxc=0;
        int count=0;
        for(int i=0; i<a.length; i++){
            if(a[i]==1){
                count+=1;
            }
            if(count>maxc){
                maxc = count;
            }
            else if(a[i]==0){
                count=0;
            }
        }
        return maxc;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1,1,0,1,1,1,1};
        System.out.println(countOnes(a));
    }
}
