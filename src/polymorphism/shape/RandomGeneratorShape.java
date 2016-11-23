/**
 * Created by Anonymous11100001 on 5/19/2016.
 */
package polymorphism.shape;
import java.util.*;

class RandomGeneratorShape {
    private Random ran = new Random(47);
    public Shape generatorShape(){
        int choosen = ran.nextInt(4);
        switch (choosen){
            case 0:
                return new Circle();
            case 1:
               return new Square();
            case 2:
                return new Polygon();
            default:
                return new Triangle();
        }
    }
}
