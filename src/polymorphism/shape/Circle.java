/**
 * Created by Anonymous11100001 on 5/19/2016.
 */
package polymorphism.shape;
import static tk.anonymous11100001.util.Print.*;

class Circle extends Shape {
    @Override void draw(){
        print("Circle.draw() ");
    }
    @Override void erase(){
        print("Circle.erase() ");
    }
    @Override void showMessage(){
        print("Circle.showMessage() ");
    }
}
