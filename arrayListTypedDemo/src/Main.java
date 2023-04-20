import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Samsun");
        sehirler.add("İstanbul");
        sehirler.add("Düzce");
        sehirler.add("Erzurum");
        sehirler.add("Ankara");

        sehirler.remove("Erzurum");

        Collections.sort(sehirler);

        for (String s:sehirler)
        {
            System.out.println(s);
        }
    }
}