public class Main {
    public static void main(String[] args) {
        CustomManager customManager = new CustomManager();
        customManager.baseDatabaseManager = new OracleDataBaseManager();
        customManager.getCustomers();
        customManager.baseDatabaseManager = new SqlServerDatabaseManager();
        customManager.getCustomers();
        customManager.baseDatabaseManager = new MySqlDatabaseManager();
        customManager.getCustomers();
    }
}