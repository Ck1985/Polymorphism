package polymorphism;
import static tk.anonymous11100001.util.Print.*;

/**
 * Created by Anonymous11100001 on 5/27/2016.
 */
class Actor{
    void act(){
        print("Actor()");
    }
}
class HappyActor extends Actor{
    void act(){
        print("HappyActor()");
    }
}
class SadActor extends Actor{
    void act(){
        print("SadActor()");
    }
}
class Stage{
    private Actor actor = new HappyActor();
    public void change(){
        actor = new SadActor();
    }
    public void perfomPlay(){
        actor.act();
    }
}
public class Transmogrify {
    public static void main(String[] args){
        Stage stage = new Stage();
        stage.perfomPlay();
        stage.change();
        stage.perfomPlay();
    }
}
