//Kadane's Algorithm : Maximum Subarray Sum in an Array
public class maxsubarrsumKA {
    public static int maxSum(int a[]) {
        int max=-10000;
        for(int i=0; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                int sum=0;
                for(int k=i; k<=j; k++){
                    sum+=a[k];
                    if(sum>=max){
                        max=sum;
                    }
                }
            }
        }
        return max;
    }
    public static int better(int a[]) {
        int max=-10000;
        for(int i=0; i<a.length; i++){
            int sum=0;
            for(int j=i; j<a.length; j++){
                sum+=a[j];
                if(sum>max){
                    max = sum;
                }
            }
        }
        return max;
    }
     public static int optimal(int a[]) {
        int sum=0;
        int max = -10000;
        int substart = 0;
        int subend = 0;
        for(int i=0; i<a.length; i++){
            sum+=a[i];
            if(sum==0){
                substart = i;
            }
            if(sum>max){
                max=sum;
                subend = i;
            }
            if(sum<0){
                sum=0;
            }
        }
        for(int i=substart; i<=subend; i++){
            System.out.print(a[i] + " ");
        }
        return max;
    }
    public static void main(String[] args) {
        int a[] = {2, 3, 5, -2, 7, -4};
        System.out.println(maxSum(a));
        System.out.println(better(a));
        System.out.println("\n" + optimal(a));
    }
}
