public class Main {
    public static void main(String[] args) {
        Product product = new Product(
                1,
                "MSİ",
                "Katana",
                23000,
                150,
                "Mavi"
        );

        /*product.SetID(1);
        product.set_description("Katana");
        product.set_name("MSİ");
        product.set_price(23000);
        product.set_stokAmount(100);*/


        ProductManager manager = new ProductManager();
        manager.Add(product);
        //manager.Add(2, "Assus", "Assus Gamin", 300, 25000);
        //System.out.println(product.name);
    }
}