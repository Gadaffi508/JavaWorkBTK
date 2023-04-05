public class Main {
    public static void main(String[] args) {
        char HarfNotu = 'A';
        switch (HarfNotu) {
            case 'A':
                System.out.print("Çok Başarılı");
                break;
            case 'B':
                System.out.print("Başarılı");
                break;
            case 'C':
                System.out.print("Orta derece");
                break;
            default:
                System.out.print("Çok çalışman lazım");
                break;
        }
                //loop Demo
            for(int i = 0; i <= 10;i++) {
                System.out.println("i : " + i);
            }
            System.out.print("Döngü bitti");
            int i = 0;
            while(i<10)
            {
                System.out.println("i : " + i);
                i++;
            }
            System.out.print("Döngü bitti");
            int j = 0;
            do{
                System.out.print(j);
                j+=2;
            }while (j<20);
    }
}