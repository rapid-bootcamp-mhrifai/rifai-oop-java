public class Superman extends Person{
    public String skill;
    public int health;

    public Superman(Integer id, String name, String gender, String address,
                   int age, String skill, int health) {
        super(id, name, gender, address, age);
        this.skill = skill;
        this.health = health;
    }
}
