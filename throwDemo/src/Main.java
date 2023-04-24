public class Main {
    public static void main(String[] args)
    {
        Accountmanager accountmanager = new Accountmanager();
        System.out.println("Hesap : "+accountmanager.getBalance());
        accountmanager.deposit(100);
        System.out.println("Hesap : "+accountmanager.getBalance());
        try
        {
            accountmanager.withdraw(90);
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap : "+accountmanager.getBalance());
        try
        {
            accountmanager.withdraw(20);
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap : "+accountmanager.getBalance());
    }
}