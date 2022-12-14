package abstractMethod;

public class Bird extends Animal{
    public Bird(String name){
        this.name = name;
    }


    @Override
    void run() {
        System.out.println("The Bird name "+ name+", can fly.");
    }

    @Override
    void canEat() {
        System.out.println("The bird can eat jangkrik");
    }
}
