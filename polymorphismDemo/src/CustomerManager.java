public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger baselogger)
    {
        this.logger=baselogger;
        this.logger.Log("Log mesajı");
    }
    public void Add()
    {
        System.out.println("Müşteri Eklendi");
    }
}
