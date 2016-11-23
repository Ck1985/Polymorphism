package polymorphism;
import static tk.anonymous11100001.util.Print.*;

/**
 * Created by Anonymous11100001 on 5/24/2016.
 */
class Characteristic{
    private String s;
    Characteristic(String s){
        this.s = s;
        print("Creating the characteristic " + this.s);
    }
    protected void dispose(){
        print("Disposing the characteristic " + this.s);
    }
}
class Description{
    private String s;
    Description(String s){
        this.s = s;
        print("Creating the description " + this.s);
    }
    protected void dispose(){
        print("Disposing the description " + this.s);
    }
}
class LivingCreature{
    private Characteristic characteristic = new Characteristic("Is alive");
    private Description description = new Description("Basic living creature");
    LivingCreature(){
        print("LivingCreature()");
    }
    protected void dispose(){
        print("Disposing the LivingCreature .....");
        description.dispose();
        characteristic.dispose();
    }
}
class Animal extends LivingCreature{
    private Characteristic characteristic = new Characteristic("Has heart");
    private Description description = new Description("Animal not Vegetable");
    Animal(){
        print("Animal()");
    }
    protected void dispose(){
        print("Disposing the Animal .....");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }
}
class Amphibian extends Animal{
    private Characteristic characteristic = new Characteristic("Can live in water");
    private Description description = new Description("Both water and land");
    Amphibian(){
        print("Amphibian()");
    }
    protected void dispose(){
        print("Disposing the Amphabian ......");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }
}
public class Frog extends Amphibian {
    private Characteristic characteristic = new Characteristic("Clark");
    private Description description = new Description("Eat bugs");
    Frog(){
        print("Frog()");
    }
    protected void dispose(){
        print("disposing the Frog .....");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }

    public static void main(String[] args){
        Frog frog = new Frog();
        print("Bye");
        frog.dispose();
    }
}
