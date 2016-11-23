package polymorphism.gordent;
import static tk.anonymous11100001.util.Print.*;
/**
 * Created by Anonymous11100001 on 5/21/2016.
 */
class Mouse extends Gordent {
    private String color = "White";
    private Characteristic characteristic = new Characteristic("eat everything");
    private Description description = new Description("very durty");

    Mouse(){
        print("Mouse()");
    }

    public Mouse(String nameMouse, int ageLongMouse){
        super(nameMouse, ageLongMouse);
        this.name = nameMouse;
        this.ageLong = ageLongMouse;
    }
    @Override void eat(ListFood listFood){
        print("Mouse.eat() " + listFood);
    }
    @Override void move(ListActive listActive){
        print("Mouse.move() " + listActive);
    }
    @Override void leave(ListLocation listLocation){
        print("Mouse.leave() " + listLocation);
    }
}
