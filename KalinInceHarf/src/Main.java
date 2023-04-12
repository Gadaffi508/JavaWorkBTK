public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        char harf = 'A';

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Harfimiz Kalın Seslidir");
                break;
            default:
                System.out.println("Harfimiz İnce Seslidir");
        }
        //6-->1,2,3
        //28-->1,2,4,7,14
        int number = 5;
        int total = 0;

        for (int i =1;i<number;i++){
            if (number % i ==0){
                total = total + i;
            }
        }
        if (total == number){
            System.out.println("Mükemmel Sayıdır");
        }else {
            System.out.println("Mükemmel Sayı değildir");
        }
    }
}