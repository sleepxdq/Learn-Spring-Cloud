package innerclassses;

/**
 * @Auther Dongqiang
 * @Date 2018/1/23 11:23
 */
public class DotThis {

    void f() {
        System.out.println("DotThis.f()!");
    }

    public DotThis() {
        System.out.println("DotThis!");
    }

    public class Inner {

        public DotThis outer1() {
            return new DotThis();
        }

        public DotThis outer2() {
            return DotThis.this;
        }
    }
    public Inner inner1() {
        return new DotThis.Inner();
    }

    public Inner inner2() {
        return new Inner();
    }

    public Inner inner3() {
        return this.new Inner();
    }

}
