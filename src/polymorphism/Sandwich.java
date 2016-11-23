/**
 * Created by Anonymous11100001 on 5/23/2016.
 */
package polymorphism;
import static tk.anonymous11100001.util.Print.*;

class Meal{
    Meal(){
        print("Meal()");
    }
}
class Bread{
    Bread(){
        print("Bread()");
    }
}
class Cheese{
    Cheese(){
        print("Cheese()");
    }
}
class Lettuce{
    Lettuce(){
        print("Lecttuce()");
    }
}
class Pickle{
    Pickle(){
        print("Pickle()");
    }
}
class Lunch extends Meal{
    Lunch(){
        print("Lunch()");
    }
}
class PortableLunch extends Lunch{
    PortableLunch(){
        print("PortableLunch()");
    }
}
public class Sandwich extends PortableLunch {
    private Bread bread = new Bread();
    private Cheese cheese = new Cheese();
    private Lettuce lettuce = new Lettuce();
    private Pickle pickle = new Pickle();
    public Sandwich(){
        print("Sandwich()");
    }
    public static void main(String[] args){
        Sandwich sandwich = new Sandwich();
    }
}
