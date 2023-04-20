import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] dizi = new int[] {0,1,2};
        dizi = new int[4];

        ArrayList sayilar = new ArrayList();
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Merhaba");
        sayilar.set(0,55);
        sayilar.remove(0);
        sayilar.clear();

        System.out.println(sayilar.size());
        System.out.println(sayilar.get(2));

        for (Object i:sayilar)
        {
            System.out.println(i);
        }

    }
}