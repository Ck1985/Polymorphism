package polymorphism;
import static tk.anonymous11100001.util.Print.*;
/**
 * Created by Anonymous11100001 on 5/27/2016.
 */
class Grain{
    public String toString(){
        return "Grain()";
    }
}
class Wheat extends Grain{
    public String toString(){
        return "Wheat()";
    }
}
class Mill{
    public Grain process(){
        return new Grain();
    }
}
class WheatMill{
    public Wheat process(){
        return new Wheat();
    }
}
public class CovariantReturnType {
    public static void main(String[] args){
        Mill m = new Mill();
        Grain g = m.process();
        print(g);
        WheatMill wm = new WheatMill();
        Wheat w = wm.process();
        print(w);
    }
}
