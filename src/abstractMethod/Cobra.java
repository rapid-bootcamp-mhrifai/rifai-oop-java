package abstractMethod;

public class Cobra extends Ular{
    public Cobra(String name){
        this.name = name;
    }

    @Override
    void kill() {
        System.out.println("The cobra name "+name+", can kill you.");
    }
}
