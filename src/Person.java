/**
 * Created by Anonymous11100001 on 5/19/2016.
 */
import java.util.*;
import static tk.anonymous11100001.util.Print.*;

public class Person {
    public void ride(Cycle c){
        c.rotate();
    }
    public void repaireWheels(Cycle c){
       print(c.wheels());
    }
    public static void main(String[] args){
        Person person = new Person();
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        person.ride(unicycle);
        person.ride(bicycle);
        person.ride(tricycle);
        person.repaireWheels(unicycle);
        person.repaireWheels(bicycle);
        person.repaireWheels(tricycle);
    }
}
