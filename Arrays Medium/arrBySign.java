public class arrBySign {
    public static void rearrange(int a[]) {
        int x=0;
        int y=0;
        int positives[] = new int[a.length/2];
        int negatives[] = new int[a.length/2];
        for(int i=0; i<a.length; i++){
            if(a[i]>0){
                positives[x++] = a[i];
            }
            if(a[i]<0){
                negatives[y++] = a[i];
            }
        }
        x=0;
        y=0;
        for(int i=0; i<a.length; i++){
            if(i%2==0){
                a[i] = positives[x++];
            }
            else{
                a[i] = negatives[y++];
            }
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,-3,-1,-2,-3};
        rearrange(a);
    }
}
