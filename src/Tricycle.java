/**
 * Created by Anonymous11100001 on 5/19/2016.
 */
class Tricycle extends Cycle {
    @Override void rotate(){
        System.out.println("Tricycle.rotate() ");
    }
    @Override String wheels(){
            return ("The number of wheels Tricycle = " + NumberWheels.THREE_WHEELS);
    }
}
