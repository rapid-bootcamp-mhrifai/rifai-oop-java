package encapsulation;

public class MainCategory {
    public static void main(String[] args) {
        Category category = new Category();
        category.setId(1);
        category.setName("Ikan Bakar");
        category.setHarga(10000);
        System.out.println(category);

        System.out.println(new Category(2,"Minuman Es Jeruk",5000));
        System.out.println(new Category(3,"Minuman Es Teh",3000));
    }
}
