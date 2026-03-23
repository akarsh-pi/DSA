import java.util.*;
class Counter{
    static int count=0;
    Counter(){
        count++;
    }
    static void showCount(){
        System.out.println(count);
    }
}

public class Lab4Q2 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter.showCount();
        Counter c2 = new Counter();
        Counter.showCount();
    }
}
