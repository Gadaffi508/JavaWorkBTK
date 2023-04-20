import Matematik.*;//yıldız ile pakettedi her şeye ulaşabiliyorsun

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adınızı giriniz : ");
        String isim = scanner.nextLine();
        System.out.println("Merhaba : "+isim);
        DortIslem dortIslem = new DortIslem();
        dortIslem.Topla(5,6);
        Logaritma logaritma = new Logaritma();
        logaritma.logaritmaHesapla();
    }
}