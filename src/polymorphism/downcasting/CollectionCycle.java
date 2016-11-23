/**
 * Created by Anonymous11100001 on 5/28/2016.
 */
package polymorphism.downcasting;
import static tk.anonymous11100001.util.Print.*;

class Cycle{
    public void rotate(){

    }
    public void run(){

    }
}
class UniCycle extends Cycle{
    public void balance(){

    }
}
class Bycicle extends Cycle{
    public void balance(){

    }
}
class TriCycle extends Cycle{
    public void notBalance(){

    }
}
public class CollectionCycle {
    public static void main(String[] args){
        Cycle[] cycles = {
                new UniCycle(),
                new Bycicle(),
                new TriCycle()
        };
        //! cycles[0].balance();
        //! cycles[1].balance();
        //! cycles[2].balance();

        for(Cycle c : cycles){
            ((UniCycle)c).balance();
            ((TriCycle)c).notBalance();
            ((Bycicle)c).balance();
        }
    }
}
