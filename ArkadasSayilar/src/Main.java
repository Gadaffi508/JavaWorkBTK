public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //220-284

        int sayıA=220;
        int sayıB = 284;
        int toplamA = 0;
        int toplamB = 0;

        for (int i = 1;i<sayıA;i++){
            if (sayıA%i==0){
                toplamA += i;
            }
        }
        for (int i = 1;i<sayıB;i++){
            if (sayıB%i==0){
                toplamB += i;
            }
        }
        if (sayıA==toplamB && sayıB==toplamA){
            System.out.println("Bu İkisi Arkadaştır");
        }
        else {
            System.out.println("Bu İkisi Arkadaş değildir");
        }

        int[] sayı =new int[]{1,2,4,5,7,9,0};
        int aranacak = 5;
        boolean varmı =false;

        for (int sayılar :sayı){
            if (sayılar==aranacak){
                varmı=true;
                break;
            }
        }
        if (varmı){
            System.out.println("Sayı Mevcut");
        }
        else {
            System.out.println("Sayı Mevcut değildir");
        }
    }
}