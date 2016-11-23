package polymorphism.music;

/**
 * Created by Anonymous11100001 on 5/19/2016.
 */
class Brass extends Winds{
    @Override void play(Notes notes){
        System.out.println("Brass.play() " + notes);
    }
    public String toString(){
        return "Brass.what()";
    }
}
