public class Main {
    public static void main(String[] args) {
    SayıBulmaca();
    }
    public static void SayıBulmaca()
    {
        int[] sayı =new int[]{1,2,4,5,7,9,0};
        int aranacak = 5;
        boolean varmı =false;

        for (int sayılar :sayı){
            if (sayılar==aranacak){
                varmı=true;
                break;
            }
        }
        mesajVer(varmı);

    }
    public static void mesajVer(boolean varmı)
    {
        if (varmı){
            System.out.println("Sayı Mevcut");
        }
        else {
            System.out.println("Sayı Mevcut değildir");
        }
    }
}