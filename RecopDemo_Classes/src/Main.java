public class Main {
    public static void main(String[] args)
    {
        fourProcess dörtişlem = new fourProcess();
        int collect = dörtişlem.Collect(5,6);
        int extraction = dörtişlem.Extraction(5,6);
        int divide = dörtişlem.Divide(5,6);
        int i̇mpact = dörtişlem.İmpact(5,6);

        System.out.println("5 ve 6 nın 4 işlemi : " +
                "Toplama : " +collect +
                " Çıkarma : "+extraction +
                " Bölme : " +divide +
                " Çarpma : "+i̇mpact );
    }
}