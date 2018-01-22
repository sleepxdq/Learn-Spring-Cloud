package one;

/**
 * @Auther Dongqiang
 * @Date 2017/12/4 19:07
 */
public class Cup {

    Cup(int marker) {
        System.out.println("one.Cup(" + marker +")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
    static {
        System.out.println("--------");
    }
}
