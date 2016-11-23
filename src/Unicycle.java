/**
 * Created by Anonymous11100001 on 5/19/2016.
 */
class Unicycle extends Cycle {
   @Override void rotate(){
        System.out.println("Unicycle.rotate() ");
    }
    @Override String wheels(){
        return ("The number of wheels of Unicycle = " + NumberWheels.ONE_WHEEL);
    }
}
