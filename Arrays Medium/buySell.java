public class buySell {
    public static int maxProfit(int a[]){
        int maxprofit = 0;
        for(int i=a.length-1; i>=0; i--){
            for(int j=i-1; j>=0; j--){
                int profit = a[i];
                profit-=a[j];
                if(profit>maxprofit){
                    maxprofit = profit;
                }
            }
        }
        return maxprofit;
    }
    public static int better(int a[]){
        int maxprofit = 0;
        int smallest = a[0];
        int small = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]<smallest){
                smallest = a[i];
                small = i;
            }
        }
        int largest = a[small];
        for(int i=small+1; i<a.length; i++){
            if(a[i]>largest){
                largest = a[i];
            }
        }
        maxprofit = largest - smallest;
        return maxprofit;
    }
    public static int optimal(int a[]) {
        int cost=0;
        int min=a[0];
        int maxprofit = 0;
        for(int i=1; i<a.length; i++){
            cost = a[i] - min;
            if(maxprofit<cost){
                maxprofit = cost;
            }
            if(a[i]<min){
                min = a[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int a[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(a));
        System.out.println(better(a));
        System.out.println(optimal(a));
    }
}
