package duotai;

/**
 * @Auther Dongqiang
 * @Date 2018/1/16 17:49
 */
public class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }
    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}
