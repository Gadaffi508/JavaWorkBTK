public class Main {
    public static void main(String[] args) {
        String message = "Bugun Yusuf çok yakışıklı";
        String newmessage = Word();
        System.out.println(newmessage);
        int number3 = Collect(4,5);
        System.out.println(number3);
        int number4 = Collect2(1,2,3,4,5,6,7,8,9);
        System.out.println(number4);
    }
    public static void Added()
    {
        System.out.println("Eklendi");
    }
    public static void Deleted()
    {
        System.out.println("Silindi");
    }
    public static void Updated() {
        System.out.println("Güncellendi");
    }
    public static int Collect(int number1,int number2)
    {
        return number1+number2;
    }
    public static String Word()
    {
        return "Yusuf";
    }
    public static int Collect2(int... Numbers)
    {
        int number5=0;
        for (int num:Numbers) {
            number5 +=num;
        }
        return number5;
    }
}