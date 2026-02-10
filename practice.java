import java.util.*;
class Ref {

    int x;

 

    Ref(int x) {

        this.x = x;

    }

}
public class practice {
    static void change(Ref r1, Ref r2) {

        r1.x = r1.x + 10;

        r2 = new Ref(50);

        r2.x = r2.x + r1.x;

    }

 

    public static void main(String[] args) {

 

        Ref a = new Ref(10);

        Ref b = new Ref(20);

 

        change(a, b);

 

        System.out.println(a.x + " " + b.x);

    }
} 