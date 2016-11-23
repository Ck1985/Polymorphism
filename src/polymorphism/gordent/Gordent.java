/**
 * Created by Anonymous11100001 on 5/21/2016.
 */
package polymorphism.gordent;
import static tk.anonymous11100001.util.Print.*;

class Gordent {
    private String color = "Grey";
    private Characteristic characteristic = new Characteristic("has tail");
    private Description description = new Description("small mamal");

    protected String name;
    protected int ageLong;

    Gordent(){
        print("Gordent() ");
    }
    Gordent(String name, int ageLong){
        this.name = name;
        this.ageLong = ageLong;
    }
    public boolean equals(Object object){
        if(object == this){
            return true;
        }
        if(!(object instanceof Gordent)){
            return false;
        }
        Gordent g = (Gordent)object;
        return (this.name == g.name) && (this.ageLong == ageLong);
    }
    void eat(ListFood listFood){
        print("Gordent.eat()");
    }
    void move(ListActive listActive){
        print("Gordent.move()");
    }
    void leave(ListLocation listLocation){
        print("Gordent.leave()");
    }
}
