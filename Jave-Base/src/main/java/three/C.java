package three;

/**
 * @Auther Dongqiang
 * @Date 2017/12/25 16:07
 */
public class C extends A{
    private B b;

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.b);
    }

    private final B b1 = new B();
    private final B b2 = b1;

}
