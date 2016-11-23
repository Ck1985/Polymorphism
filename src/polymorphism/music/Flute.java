package polymorphism.music;

/**
 * Created by Anonymous11100001 on 5/21/2016.
 */
class Flute extends Winds {
    void play(Notes notes){
        System.out.println("Flute.play() " + notes);
    }
    void adjust(){
        System.out.println("adjusting Flute");
    }
    public String toString(){
        return "Flute";
    }
}
