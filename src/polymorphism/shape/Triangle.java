/**
 * Created by Anonymous11100001 on 5/19/2016.
 */
package polymorphism.shape;
import static tk.anonymous11100001.util.Print.*;

class Triangle extends Shape {
    @Override void draw(){
        print("Triagnle.draw() ");
    }
    @Override void erase(){
        print("Triangle.erase() ");
    }
    void showMessage(){
        print("Triangle.showMessage() ");
    }
}
