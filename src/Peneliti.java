public class Peneliti extends Person{
    public String jurnal;
    public int totalJurnal;

    public Peneliti(Integer id, String name, String gender, String address,
                    int age, String jurnal, int totalJurnal){
        super(id, name, gender, address, age);
        this.jurnal = jurnal;
        this.totalJurnal = totalJurnal;
    }
}
