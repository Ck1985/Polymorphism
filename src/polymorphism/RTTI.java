package polymorphism;

/**
 * Created by Anonymous11100001 on 5/28/2016.
 */
class UseFul{
    public void f(){

    }
    public void g(){

    }
}
class MoreUseful extends UseFul{
    public void m(){

    }
    public void n(){

    }
    public void u(){

    }
    public void k(){

    }
}
public class RTTI {
    public static void main(String[] args){
        UseFul[] useFuls = new UseFul[]{
                new UseFul(),
                new MoreUseful()
        };
        useFuls[0].f();
        useFuls[1].g();
        // useFuls[1].u(); Error: method u() is not belong to base class
        // so if you upcast you can not access to it.
        // You must do downcasting
        ((MoreUseful)useFuls[0]).k();
        ((MoreUseful)useFuls[1]).u();
    }
}
