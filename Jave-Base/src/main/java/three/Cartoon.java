package three;

/**
 * @Auther Dongqiang
 * @Date 2017/12/25 15:51
 */
public class Cartoon extends Drawing {

    private int count;
    public Cartoon() {
        super();
    }
    public Cartoon(int count) {
        super("shishui");
        this.count = count;
    }
    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon(1);
        Cartoon cartoon1 = new Cartoon();
    }
}
