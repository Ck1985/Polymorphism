package polymorphism.music;
import static tk.anonymous11100001.util.Print.*;
/**
 * Created by Anonymous11100001 on 5/17/2016.
 */
class Winds extends Instrucments {
    @Override void play(Notes notes){
        System.out.println("Winds.play() " + notes);
    }
    public String toString(){
        return "Winds.what()";
    }
    void adjust(){
        print("adjusting winds ");
    }
}
