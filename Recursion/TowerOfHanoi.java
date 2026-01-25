public class TowerOfHanoi {
    public static void TowerOfHanoi(int n, String S, String H, String D){
        if(n==1){
            System.out.println("Move Disk "+n+" From "+ S + " to " + D);
            return;
        }
        TowerOfHanoi(n-1, S, D, H);
        System.out.println("Move Disk "+n+" From "+ S + " to " + D);
        TowerOfHanoi(n-1, H, S, D);

    }
    public static void main(String[] args) {
        int n=3;
        TowerOfHanoi(n, "S", "H","D" );
    }
}
