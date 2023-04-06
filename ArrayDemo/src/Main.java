public class Main {
    public static void main(String[] args) {
        String[] student = new String[3];
        student[0] = "Yusuf";
        student[1] = "Eda";
        student[2] = "Pınar";


        for (int i = 0; i<student.length;i++)
        {
            System.out.println(student[i]);
        }
        for(String ogrenci:student)
        {
            System.out.println(ogrenci);
        }

        double[] myList={1.2,3.4,5.6,7.8};
        double total=0;
        double max = myList[0];
        for(Double list:myList)
        {
            if (max<list)
            {
                max = list;
            }
            total = total + list;
            System.out.println(list);
        }
        System.out.println("Total " + total);
        System.out.println("Max " + max);
        System.out.println("--------------------------");

        String[][] sehirler = new String[4][3];
        sehirler[0][0] = "Samsun";
        sehirler[0][1] = "Canik";
        sehirler[1][0] = "İzmir";
        sehirler[1][1] = "Alaçatı";
        sehirler[2][0] = "İstabul";
        sehirler[2][1] = "Taksim";
        sehirler[3][0] = "Ankara";
        sehirler[3][1] = "Zeytinlik";
        for(int i = 0; i<4;i++)
        {
            for(int j = 0; j<1;j++)
            {
                System.out.println("Şehir : " + sehirler[i][j] + " İlçesi : " + sehirler[i][j+1]);
            }
        }
    }
}