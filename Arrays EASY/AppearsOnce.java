public class AppearsOnce {
    public static int appearsOnce(int a[]){
        for(int i=0; i<a.length; i++){
            int find = a[i];
            int count=0;
            for(int j=0; j<a.length; j++){
                if(a[j]==find){
                    count+=1;
                }
                if(count>1){
                    break;
                }
            }
            if(count==1){
                return find;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {4,1,2,1,2};
        System.out.println(appearsOnce(a));
    }
}
