package one;

/**
 * @Auther Dongqiang
 * @Date 2017/12/4 19:10
 */
public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");

        Cup cup = new Cup(1);
        Cup cup1 = Cups.cup1;

    }
}
