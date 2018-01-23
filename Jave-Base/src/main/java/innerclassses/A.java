package innerclassses;

/**
 * @Auther Dongqiang
 * @Date 2018/1/23 19:15
 */
public class A {
    public U makeU() {
        return new UA();
    }

    class UA implements U{

        @Override
        public void way1() {
            System.out.println("way1!");
        }

        @Override
        public void way2() {
            System.out.println("way2!");
        }

        @Override
        public void way3() {
            System.out.println("way3!");
        }
    }
}
