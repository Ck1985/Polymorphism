package polymorphism;

/**
 * Created by Anonymous11100001 on 5/26/2016.
 */
class Glyph{
    void draw(){
        System.out.println("Glyph.draw() ");
    }
    Glyph(){
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}
class RoundGlyph extends Glyph{
    private int radious = 1;
    RoundGlyph(int radious){
        this.radious = radious;
        System.out.println("RoundGlyph.RoundGlyph(), radious = " + this.radious);
    }
    void draw(){
        System.out.println("RoundGlyph.draw(), radious = " + this.radious);
    }
}
class RectangularGlyph extends Glyph{
    private int length = 4;
    private int width = 2;
    RectangularGlyph(int length, int width){
        this.length = length;
        this.width = width;
        System.out.println("The RectangularGlyph.RectangularGlyph() has length = " + this.length + " and width = " + this.width);
    }
    void draw(){
        System.out.println("The RectangularGlyph.draw() has length = " + this.length + " and width = " + this.width);
    }
}
public class PolyConstructor {
    public static void main(String[] args){
        //new RoundGlyph(7);
        new RectangularGlyph(7, 19);
    }
}
