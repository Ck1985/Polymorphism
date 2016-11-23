package polymorphism.music;

/**
 * Created by Anonymous11100001 on 5/19/2016.
 */
//Overloading instead of upCasting
public class Music2 {
    public void tune(Winds winds){
        winds.play(Notes.MIDDLE_C);
    }
    public void tune(Strings stringed){
        stringed.play(Notes.B_FLAT);
    }
    public void tune(Brass brass){
        brass.play(Notes.C_SHARP);
    }
    public static void main(String[] args){
        Winds winds = new Winds();
        Strings stringed = new Strings();
        Brass brass = new Brass();
        Music2 music2 = new Music2();
        music2.tune(winds);
        music2.tune(stringed);
        music2.tune(brass);
    }
}
