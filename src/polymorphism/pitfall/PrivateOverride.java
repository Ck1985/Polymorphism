/**
 * Created by Anonymous11100001 on 5/22/2016.
 */
package polymorphism.pitfall;

import com.sun.org.apache.xml.internal.security.keys.keyresolver.implementations.PrivateKeyResolver;

public class PrivateOverride {
    private void f(){
        System.out.println("private f()");
    }
    public void g(){
        System.out.println("public g()");
    }
    public static void main(String[] args){
        Derived derived = new Derived();
        derived.f();
        PrivateOverride derived2 = new Derived();
        derived2.f();
        derived2.g();
        PrivateOverride privateOverride = new PrivateOverride();
        privateOverride.g();
        Derived derived3 = new Derived();
        derived3.g();
        PrivateOverride privateOverride1  = new Derived();
        privateOverride1.g();
    }
}
class Derived extends PrivateOverride{
    //@Override void f(){
        //System.out.println("public f()");
    //} Error can not override private method
    //Without @Override keyword:
    public void f(){
        System.out.print("public f()");
    }
    @Override public void g(){
        System.out.println("public Override g()");
    }
}
