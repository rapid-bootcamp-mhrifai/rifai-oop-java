package interfaceClass;

public class ProductImpl implements Product{
    private String nameProduct;
    private int harga;
    private int quantity;


    public ProductImpl(String nameProduct, int harga, int quantity) {
        this.nameProduct = nameProduct;
        this.harga = harga;
        this.quantity = quantity;
    }

    @Override
    public String getProduct() {
        return this.nameProduct;
    }

    @Override
    public int getHarga() {
        return this.harga;
    }

    @Override
    public int getQuantity() {
        return this.quantity;
    }
}
