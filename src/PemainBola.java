public class PemainBola extends Person{
    public String club;
    public int exp;

    public PemainBola(Integer id, String name, String gender, String address,
                      int age, String club, int exp){
        super(id, name, gender, address, age);
        this.club = club;
        this.exp = exp;
    }
}
