package polymorphism.gordent;
import jdk.nashorn.internal.ir.Block;
import sun.security.krb5.internal.crypto.Des;

import static tk.anonymous11100001.util.Print.print;

/**
 * Created by Anonymous11100001 on 5/21/2016.
 */
class Gerbil {
    private BlockGordent blockGordent;
    private static long numberGerbil = 0;
    private final long idGerbil = ++this.numberGerbil;

    Gerbil(BlockGordent blockGordent){
        this.blockGordent = blockGordent;
        this.blockGordent.addRef();
        print("Creating Gerbil object.... " + this);
    }

    public void dispose(){
        this.numberGerbil--;
        print("Disposing Gerbil object ...." + this);
        this.blockGordent.dispose();
    }
    public String toString(){
        return " " + this.idGerbil;
    }

    /*private String color = "Black";
    private Characteristic characteristic = new Characteristic("like cheese");
    private Description description = new Description("nocturnal");

    Gerbil(){
        print("Gerbil() ");
    }

    public Gerbil(String nameGerbil, int ageLongGerbil){
        super(nameGerbil, ageLongGerbil);
        this.name = nameGerbil;
        this.ageLong = ageLongGerbil;
    }
    @Override void eat(ListFood listFood){
        print("Gerbil.eat() " + listFood);
    }
    @Override void move(ListActive listActive){
        print("Gerbil.move() " + listActive);
    }
    @Override void leave(ListLocation listLocation)
    {
        print("Gerbil.leave() " + listLocation);
    }

    public static void main(String[] args){
        Gerbil gerbil = new Gerbil();
    }*/
}
