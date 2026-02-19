public class majorityElement {
    public static int majorityElement(int a[]){
        int ele = 0;
        int count=0;
        for(int i=0; i<a.length; i++){
            if(count==0){
                ele=a[i];
                count=1;
            }
            else{
                if(a[i]==ele){
                    count++;
                }
                else{
                    count--;
                }
            }
        }
        count=0;
        for(int i=0; i<a.length; i++){
            if(a[i]==ele){
                count++;
            }
        }
        if(count>a.length/2){
            return ele;
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int a[] = {1, 1, 1, 2, 1, 2};
        System.out.println(majorityElement(a));
    }
}
