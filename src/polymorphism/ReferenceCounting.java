/**
 * Created by Anonymous11100001 on 5/25/2016.
 */
package polymorphism;
import static tk.anonymous11100001.util.Print.*;

class ObjectToShared{
    private int refCount = 0;
    private static long numberObject = 0;
    private final long idObject = numberObject++;

    ObjectToShared(){
        print("Creating ..... " + this);
    }

    public void addRef()
    {
        this.refCount++;
    }
    protected void finalize(){
        if(refCount > 0){
            print("this Object: "+ this + " is in use of another program!");
        }
    }
    protected void dispose(){
        if(--refCount == 0){
            print("Disposing ..... " + this);
        }
    }
    public String toString(){
        return "Object to Shared: " + this.idObject;
    }
}
class Composing{
    private ObjectToShared shared;
    private static long numberObject = 0;
    private final long idObject = numberObject++;

    Composing(ObjectToShared shared){
        this.shared = shared;
        print("Creating ...." + this);
        shared.addRef();
    }

    protected void dispose(){
        this.numberObject--;
        print("Disposing ...." + this);
        shared.dispose();
    }
    public String toString(){
        return "Object " + this.idObject;
    }
}

public class ReferenceCounting {
    public static void main(String [] args){
        ObjectToShared obj = new ObjectToShared();
        Composing[] arraCom = new Composing[]{new Composing(obj), new Composing(obj), new Composing(obj), new Composing(obj)};
        for(Composing c : arraCom){
            c.dispose();
        }
        Composing comp2 = new Composing(obj);
        Composing comp3 = new Composing(obj);
        obj.finalize();
        ObjectToShared shared = new ObjectToShared();
        Composing comp4 = new Composing(shared);
        shared.finalize();
    }
}
