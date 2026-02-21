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
    public static void main(String[] args) {
        int a[] = {7,6,4,3,1};
        System.out.println(maxProfit(a));
    }
}
