package practisePrograms;
import java.util.*;

abstract class Myclass {
    abstract void calc(int x);
}
class sub1 extends Myclass {
    @Override
    void calc(int x) {
        System.out.println("square: " + (x * x));
    }
}
class sub2 extends Myclass {
    @Override
    void calc(int x) {
        System.out.println("cube: " + (x * x * x));
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        sub1 obj1 = new sub1();
        sub2 obj2 = new sub2();
        obj1.calc(234);
        obj2.calc(234);
    }
}
