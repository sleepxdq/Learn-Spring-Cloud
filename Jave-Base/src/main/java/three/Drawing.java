package three;

/**
 * @Auther Dongqiang
 * @Date 2017/12/25 15:51
 */
class Drawing extends Art {
    private String author;
    Drawing() {
        System.out.println("Drawing!");
    }

    Drawing(String author) {
        super("动画片");
        this.author = author;
        System.out.println("Drawing " + author);
    }
}
