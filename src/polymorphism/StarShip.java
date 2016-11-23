package polymorphism;
import static tk.anonymous11100001.util.Print.*;

/**
 * Created by Anonymous11100001 on 5/27/2016.
 */
class Alert{
    void rang(){
        print("Alert rang ....");
    }
}
class AlertRed extends Alert{
    void rang(){
        print("Alert Red rang ....");
    }
}
class AlertGreen extends Alert{
    void rang(){
        print("Alert Green rang ...");
    }
}
class AlertYellow extends Alert{
    void rang(){
        print("Alert Yellow rang ...");
    }
}
class StateAlert{
    private Alert alert = new AlertYellow();
    public void changeState1(){
        alert = new AlertGreen();
    }
    public void changeState2(){
        alert = new AlertRed();
    }
    public void performAlert(){
        alert.rang();
    }
}
public class StarShip {
    public static void main(String[] args){
        StateAlert stateAlert = new StateAlert();
        stateAlert.performAlert();
        stateAlert.changeState1();
        stateAlert.performAlert();
        stateAlert.changeState2();
        stateAlert.performAlert();
    }
}
