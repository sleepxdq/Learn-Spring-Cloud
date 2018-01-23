package innerclassses;

/**
 * @Auther Dongqiang
 * @Date 2018/1/23 11:30
 */
public class DotThisTest {
    public static void main(String[] args) {
        DotThis dotThis = new DotThis();
        DotThis.Inner inner1 = dotThis.inner1();
        DotThis.Inner inner2 = dotThis.inner2();

        DotThis.Inner inner = dotThis.new Inner();

        System.out.println(inner1.equals(inner2));

        System.out.println(inner1.equals(dotThis.inner3()));
        System.out.println(inner2.equals(dotThis.inner3()));

        System.out.println(dotThis.equals(inner1.outer1()));
        System.out.println(dotThis.equals(inner1.outer2()));

        System.out.println(dotThis.equals(inner2.outer1()));
        System.out.println(dotThis.equals(inner2.outer2()));
    }
}
