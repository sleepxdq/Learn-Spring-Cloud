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
}
