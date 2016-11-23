/**
 * Created by Anonymous11100001 on 5/19/2016.
 */
class Bicycle extends Cycle {
    @Override void rotate(){
        System.out.println("Bicycle.rotate() ");
    }
    @Override String wheels(){
        return ("The number of wheels of Bicycle = " + NumberWheels.TWO_WHEELS);
    }
}
