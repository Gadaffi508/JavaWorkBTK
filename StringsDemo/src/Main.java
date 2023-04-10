public class Main {
    public static void main(String[] args) {
        String mesaj = "Yusuf Sen Çok yakışıklısın"; //char[] = String
        System.out.println(mesaj);
        System.out.println("Eleman Sayısı :" + mesaj.length());
        System.out.println("2. Eleman :" + mesaj.charAt(1));
        System.out.println(mesaj.concat(" Her daim!"));
        System.out.println(mesaj.startsWith("Y")); // Y ile başlıyor mu doğruysa true yanlışsa false döner
        System.out.println(mesaj.endsWith("n")); // n ile bitiyor mu doğruysa true yanlışsa false döner
        char[] karekterler = new char[5];
        mesaj.getChars(0,5,karekterler,0);
        System.out.println(karekterler);
        System.out.println(mesaj.indexOf('f')); // f kaçıncı karekter
        System.out.println(mesaj.lastIndexOf('s')); // f kaçıncı karekter

        System.out.println(mesaj.replace(' ','-'));
        System.out.println(mesaj.substring(1));
        System.out.println(mesaj.substring(1,4));//birden başla 4 e kadar yaz

        for (String kelime: mesaj.split(" ")) {
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase()); // bütün harfleri küçültür
        System.out.println(mesaj.toUpperCase()); // bütün harfleri büyültür

    }
}