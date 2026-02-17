import java.util.*;
public class twoSum {
    public static void twoSum(int nums[], int target){
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("[" + i + ", " + j + "]");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        twoSum(a, target);
    }
}
