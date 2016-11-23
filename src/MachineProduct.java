/**
 * Created by Anonymous11100001 on 5/22/2016.
 */
public class MachineProduct {
    public static void repairMachine(Machine machine){
        System.out.println("Repairing the machine");
    }
    public static void main(String[] args){
       // DirselMachine diesel = new DirselMachine();
       // Machine machine = (Machine)diesel;
        //machine.active();

        Machine machine = new Machine();
        machine.active();
    }
}
