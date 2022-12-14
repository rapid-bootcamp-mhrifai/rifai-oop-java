package abstractMethod;

public class Tiger extends Animal{
    public Tiger(String name){
        this.name = name;
    }

    @Override
    void run() {
        System.out.println("The tiger name "+name+", can run.");
    }

    @Override
    void canEat() {
        System.out.println("The tiger can kill man");
    }
}
