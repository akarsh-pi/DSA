import java.util.*;
public class LongestArraywSumK {
    public static int sumK(int a[], int k){
        int result = 0;
        int n = a.length;
        for(int i=0; i<n; i++){
            int count=0;
            int sum=0;
            for(int j=i; j<n; j++){
                if(sum==k){
                    if(result<count){
                        result=count;
                    }
                    break;
                }
                else{
                    sum+=a[j];
                    count++;
                }
            }
        }
        return result;
    }
    
    public static int optimal(int a[], int k){
        int right=0;
        int left=0;
        int n = a.length;
        int sum=0;
        int len=0;
        while(right<n){
            while(left<=right && sum>k){
                sum-=a[left];
                left++;
            }

            if(sum == k){
                if((right - left ) > len){
                    len = right - left ;
                }
            }
            
            right++;
            if(right<n){
                sum+=a[right];
            }
        }
        return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the subarray sum: ");
        int k = sc.nextInt();
        System.out.println(sumK(a, k));
        System.out.println(optimal(a, k));
    }
}
