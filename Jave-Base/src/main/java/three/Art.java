package three;

/**
 * @Auther Dongqiang
 * @Date 2017/12/25 15:50
 */
class Art {
    private String name;
    Art() {
        System.out.println("Art");
    }

    Art(String name) {
        this.name = name;
        System.out.println("Art " + name);
    }
}
