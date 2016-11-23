/**
 * Created by Anonymous11100001 on 5/22/2016.
 */
package polymorphism.pitfall;
import static tk.anonymous11100001.util.Print.*;

class Super{
    public int field = 0;
    public int getField(){
        return field;
    }
}
class Sub extends Super{
    public int field = 1;
    public int getField(){
        return field;
    }
    public int getSuperField(){
        return super.field;
    }
}
public class FieldAccess {
    public static void main(String[] args){
        Super objBase = new Sub();
        print("objBase.field = " + objBase.field + " objBase.getField() = " + objBase.getField());
        Sub sub = new Sub();
        print("sub.field = " + sub.field + " sub.getField() = " + sub.getField() + "super.getField = " + sub.getSuperField());
    }
}
