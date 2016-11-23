package polymorphism.music;
import java.util.*;

/**
 * Created by Anonymous11100001 on 5/21/2016.
 */
class ObjectGeneratorRandom {
    private static Random random = new Random(40);
    static Instrucments choseObject(){
        int choosen = random.nextInt(6);
        switch (choosen){
            case 0:
                return new Winds();
            case 1:
                return new Percussion();
            case 2:
                return new Strings();
            case 3:
                return new WoodWind();
            case 4:
                return new Flute();
            default:
                return new Brass();
        }
    }
}
