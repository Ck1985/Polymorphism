package polymorphism.gordent;
import static tk.anonymous11100001.util.Print.*;

/**
 * Created by Anonymous11100001 on 5/21/2016.
 */
class BlockGordent{
    private int refCount = 0;
    private static long numberBlock = 0;
    private final long idBlock = ++numberBlock;

    BlockGordent(){
        print("Creating the Block ...." + this);
    }
    public void addRef(){
        this.refCount++;
    }
    protected void dispose(){
        if(--refCount == 0){
            this.numberBlock--;
            print("Disposing the Block ....."+ this);
        }
    }
    public String toString(){
        return " " + this.idBlock;
    }
}
class Characteristic{
    private String s;
    Characteristic(String s){
        this.s = s;
        print("Creating characteristic " + this.s);
    }
}
class Description{
    private String s;
    Description(String s){
        this.s = s;
        print("Creating description " + this.s);
    }
}
public class CollectionGordent {
   /* private static Gordent[] gordents = new Gordent[6];
    public void acivityOfGordent(Gordent gordent){
        if(gordent.equals(new Mouse("Mouse1", 3)) || (gordent.equals(new Mouse("Mouse2", 3)))){
            gordent.eat(ListFood.REFUSE);
            gordent.move(ListActive.RUN);
            gordent.leave(ListLocation.HOME);
        }else if(gordent.equals(new Gerbil("Gerbil1", 2)) || gordent.equals(new Mouse("Gerbil2", 2))){
            gordent.eat(ListFood.ANT);
            gordent.move(ListActive.RUN);
            gordent.leave(ListLocation.NATURE);
        }else{
            gordent.eat(ListFood.RICE);
            gordent.move(ListActive.RUN);
            gordent.leave(ListLocation.HOME);
        }
    }*/
    public static void main(String[] args){
        //gordents[0] = new Mouse("Mouse1", 3);
        /*gordents[1] = new Mouse("Mouse2", 3);
        gordents[2] = new Gerbil("Gerbil1", 2);
        gordents[3] = new Gerbil("Gerbil2", 2);
        gordents[4] = new Hamster("Hamster1", 1);
        gordents[5] = new Hamster("Hamster2", 1);

        CollectionGordent collectionGordent = new CollectionGordent();
        for(Gordent g : gordents){
            collectionGordent.acivityOfGordent(g);
        }*/

        BlockGordent blockGordent = new BlockGordent();
        Gerbil[] gordents = new Gerbil[]{
                new Gerbil(blockGordent),
                new Gerbil(blockGordent),
                new Gerbil(blockGordent),
                new Gerbil(blockGordent)
        };
        for(Gerbil g : gordents){
            g.dispose();
        }
    }
}
