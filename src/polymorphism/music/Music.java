package polymorphism.music;

/**
 * Created by Anonymous11100001 on 5/17/2016.
 */
public class Music {
    public void tune(Instrucments i){
        i.play(Notes.B_FLAT);
    }
    public static void main(String[] args){
        Winds winds = new Winds();
        Music music = new Music();
        music.tune(winds);
    }
}
