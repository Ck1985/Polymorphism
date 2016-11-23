package polymorphism.gordent;

import static tk.anonymous11100001.util.Print.print;

/**
 * Created by Anonymous11100001 on 5/21/2016.
 */
class Hamster extends Gordent {
    private String color = "Blue";
    private Characteristic characteristic = new Characteristic("just only eat rice");
    private Description description = new Description("Just like living with human");

    Hamster(){
        print("Hamster()");
    }

    public Hamster(String nameHamster, int ageLongHamster){
        super(nameHamster, ageLongHamster);
        this.name = nameHamster;
        this.ageLong = ageLongHamster;
    }
    @Override void eat(ListFood listFood){
        print("Hamster.eat() " + listFood);
    }
    @Override void move(ListActive listActive){
        print("Hamster.move() " + listActive);
    }
    @Override void leave(ListLocation listLocation){
        print("Hamster.leave() " + listLocation);
    }
}
