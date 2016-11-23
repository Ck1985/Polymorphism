package polymorphism.music;
import static tk.anonymous11100001.util.Print.*;

/**
 * Created by Anonymous11100001 on 5/21/2016.
 */
class Percussion extends Instrucments {
    void play(Notes notes){
        print("Percussion.play() " + notes);
    }
    public String toString(){
        return "Percussion.what()";
    }
    void adjust(){
        print("adjusting Percussion");
    }
}
