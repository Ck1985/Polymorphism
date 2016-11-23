package polymorphism.shape;

/**
 * Created by Anonymous11100001 on 5/19/2016.
 */
class Polygon extends Shape{
    @Override void draw(){
        System.out.println("Polygon.draw() ");
    }
    @Override void erase(){
        System.out.println("Polygon.erase()");
    }
    @Override void showMessage(){
        System.out.println("Polygon.showMessage()");
    }
}
