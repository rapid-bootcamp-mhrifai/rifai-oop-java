public class Batman extends Person {
    public String skill;
    public int health;

    public Batman(Integer id, String name, String gender, String address,
                  int age, String skill, int health){
        super(id,name,gender,address,age);
        this.skill = skill;
        this.health = health;
    }
}
