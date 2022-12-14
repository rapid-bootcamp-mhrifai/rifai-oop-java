package abstractMethod;

public class Anaconda extends Ular{
    public Anaconda(String name){
        this.name = name;
    }

    @Override
    void kill() {
        System.out.println("The Anaconda name "+name+", can kill you.");
    }
}
