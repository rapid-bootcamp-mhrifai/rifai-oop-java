public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.id = 1;
        person.name = "Luffy";
        person.gender = "Pria";
        person.address = "East Blue";
        person.age = 21;
        person.sayHai();

        Person person2 = new Person();
        person2.id = 2;
        person2.name = "Shanks";
        person2.gender = "Pria";
        person2.address = "East Blue";
        person2.age = 35;
        person2.sayHai();
    }
}