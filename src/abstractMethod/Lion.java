package abstractMethod;

public class Lion extends Animal{
    public Lion(String name){
        this.name = name;
    }

    @Override
    void run() {
        System.out.println("The lion "+ name+", can run");
    }

    @Override
    void canEat() {
        System.out.println("Lion can eat meal");
    }
}
