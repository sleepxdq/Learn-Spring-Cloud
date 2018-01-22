package duotai;

/**
 * @Auther Dongqiang
 * @Date 2018/1/16 17:55
 */
public class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int radius) {
        super();
        this.radius = radius;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}
