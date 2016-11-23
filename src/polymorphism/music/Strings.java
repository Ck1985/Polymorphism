package polymorphism.music;
import static tk.anonymous11100001.util.Print.*;
/**
 * Created by Anonymous11100001 on 5/19/2016.
 */
class Strings extends Instrucments{
    @Override void play(Notes notes){
        System.out.println("Strings.play() " + notes);
    }
    public String toString(){
        return "String.what()";
    }
    void adjust(){
        print("adjusting String");
    }
}
