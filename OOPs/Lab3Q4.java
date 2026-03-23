import java.util.Random;
class Die{
    Random random = new Random();
    int sideUp;
    int getSideUp(){
        return sideUp;
    }

    void roll(){
        this.sideUp = random.nextInt(1, 7);
    }

}

class DieDemo{
    void display(){
        Die d1 = new Die();
        Die d2 = new Die();
        d1.roll();
        d2.roll();
        int result = (d1.getSideUp() + d2.getSideUp());
        System.out.println(result);
    }
}

public class Lab3Q4 {
    public static void main(String[] args) {
        DieDemo d = new DieDemo();
        d.display();
    }
}
