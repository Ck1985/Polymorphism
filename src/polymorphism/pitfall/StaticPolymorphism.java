package polymorphism.pitfall;
import static tk.anonymous11100001.util.Print.*;
/**
 * Created by Anonymous11100001 on 5/22/2016.
 */
class StaticBaseClass{
    public static String staticGet(){
        return "Base Static Get()";
    }
    public String dynamicGet(){
        return "Base Dynamic Get()";
    }
}
class StaticSubClass extends StaticBaseClass{
    public static String staticGet(){
        return "Derived static Get()";
    }
    public String dynamicGet(){
        return "Derived dynamic Get()";
    }
}
public class StaticPolymorphism {
    public static void main(String[] args){
        StaticBaseClass obj = new StaticSubClass();
        obj.dynamicGet();
    }
}
