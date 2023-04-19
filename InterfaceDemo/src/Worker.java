public class Worker implements IWorkable,IEatable,IPayable
{
    public void work()
    {
        System.out.println("İnsan çalışır");
    }

    @Override
    public void eat()
    {
        System.out.println("İnsan yer");
    }

    @Override
    public void pay()
    {
        System.out.println("İnsan maaş alır");
    }
}
