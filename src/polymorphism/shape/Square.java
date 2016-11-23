/**
 * Created by Anonymous11100001 on 5/19/2016.
 */
package polymorphism.shape;
import static tk.anonymous11100001.util.Print.*;

class Square extends Shape {
    @Override void draw(){
        print("Square.draw() ");
    }
    @Override void erase(){
        print("Square.erase() ");
    }
    void showMessage(){
        print("Square.showMessage() ");
    }
}
