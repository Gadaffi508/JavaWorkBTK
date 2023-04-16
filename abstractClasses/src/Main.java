public class Main {
    public static void main(String[] args) {
        WomenCalculator womenCalculator = new WomenCalculator();
        womenCalculator.Hesapla();
        womenCalculator.GameOver();

        GameCalculator gameCalculator = new GameCalculator()
        {
            public void Hesapla()
            {

            }
        };
    }
}