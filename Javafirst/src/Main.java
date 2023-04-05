public class Main {
    public static void main(String[] args) {
        System.out.println("Merhaba java");
        //variables
        int x = 10;//2147483647 , 2147483648
        String mesaj = " Software Langue ";
        System.out.print(mesaj+x);
        //datatype
        byte y = 5; //127, -128
        boolean doğru = true;
        char karekter= 'A';
        short z = 7; //32767 ,-32768
        long alfa = 15; //en büyük
        float beta = 3.2f; //küsürat
        double gama = 3.2D; //daha fazla küsürat

        //conditionals
        int saat = 12;
        if (saat<12)
        {
            System.out.print("Gündüz");
        }
        else if(saat>12 && saat<16)
        {
            System.out.print("Öğleyin");
        }
        else
        {
            System.out.print("Akşam");
        }
    }
}