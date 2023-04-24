public class Main {
    public static void main(String[] args) {
        try
        {
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[3]);
        }
        catch (ArrayIndexOutOfBoundsException exception)
        {
            System.out.println(exception);
        }
        catch (StringIndexOutOfBoundsException exception)
        {
            System.out.println(exception);
        }
        finally
        {
         System.out.println("Hata olsa ve olmasa çalışırım ke");
        }
    }
}