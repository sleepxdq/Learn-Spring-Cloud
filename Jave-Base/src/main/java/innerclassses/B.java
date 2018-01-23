package innerclassses;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.asList;

/**
 * @Auther Dongqiang
 * @Date 2018/1/23 19:25
 */
public class B {
    private ArrayList<U> us = new ArrayList<>();

    public void add(U u) {
        us.add(u);
    }

    public void updateUsIsNull(){
        us.clear();
    }

    public void forEachWays() {
        us.forEach(u -> {
            u.way1();
            u.way2();
            u.way3();
        });
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        b.add(a.makeU());
        b.forEachWays();
        b.updateUsIsNull();
    }
}
