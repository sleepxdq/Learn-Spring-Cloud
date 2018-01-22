package one;

/**
 * @Auther Dongqiang
 * @Date 2017/12/4 18:28
 */
public class Tank {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("这是finalize方法:" + name);
    }

    public void test(String param) {
        System.out.println("固定参数" + param);
    }

    public void test(String... params) {
        System.out.println("动态参数");
    }
}
