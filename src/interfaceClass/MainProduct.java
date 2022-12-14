package interfaceClass;

public class MainProduct {
    public static void main(String[] args) {
        Product product = new ProductImpl("Indomie Goreng", 3500, 10);
        System.out.println("Product Name\t: "+product.getProduct());
        System.out.println("Harga\t\t\t: "+product.getHarga());
        System.out.println("Quantity\t\t: "+product.getQuantity());
    }
}
