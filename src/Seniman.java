public class Seniman extends Person{
    public String pengrajin;
    public int exp;

    public Seniman(Integer id, String name, String gender, String address,
                   int age, String pengrajin, int exp){
        super(id, name, gender, address, age);
        this.pengrajin = pengrajin;
        this.exp = exp;
    }
}
