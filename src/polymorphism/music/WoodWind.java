package polymorphism.music;

/**
 * Created by Anonymous11100001 on 5/21/2016.
 */
public class WoodWind extends Winds {
    void play(Notes notes){
        System.out.println("WoodWind.play() " + notes);
    }
    public String toString(){
        return "WoodWinds.what()";
    }
}
