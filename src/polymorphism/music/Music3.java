package polymorphism.music;
import static tk.anonymous11100001.util.Print.*;
/**
 * Created by Anonymous11100001 on 5/21/2016.
 */
public class Music3 {
    public static void tune(Instrucments i){
        i.play(Notes.C_SHARP);
    }
    public static void tuneAll(Instrucments[] arrObj){
        for(Instrucments e : arrObj){
            tune(e);
        }
    }
    public static void main(String[] args){
        Instrucments[] archesa = new Instrucments[]{
                                 new Winds(),
                                 new Strings(),
                                 new Percussion(),
                                 new WoodWind(),
                                 new Brass(),
                                 new Flute()
        };
        Instrucments[] arr1 = new Instrucments[6];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = ObjectGeneratorRandom.choseObject();
        }
        tuneAll(arr1);
        int[] arr = new int[]{1,2,3};
        int[] arr2 = new int[3];
        arr2[0] = 1;
        //........
        int[] arr3 = {1,2,3};
    }
}
