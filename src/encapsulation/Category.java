package encapsulation;

public class Category {
    private int id;
    private String name;
    private int harga;

    public Category() {
    }

    public Category(int id, String name, int harga) {
        this.id = id;
        this.name = name;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", harga=" + harga +
                '}';
    }
}
