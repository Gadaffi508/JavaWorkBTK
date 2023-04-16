public class Main {
    public static void main(String[] args) {
        OgretmenKrediManager ogretmen = new OgretmenKrediManager();
        System.out.println(ogretmen.Hesapla(1000));

        BaseKrediManager[] krediManagers = new BaseKrediManager[]
                {
                        new OgretmenKrediManager(),
                        new TarımKrediManager(),
                        new OgrencıKrediManager()
                };
        for(BaseKrediManager krediManager:krediManagers)
        {
            System.out.println(krediManager.Hesapla(1000));
        }
    }
}