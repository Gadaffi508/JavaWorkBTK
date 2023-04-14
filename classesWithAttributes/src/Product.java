public class Product {

    public Product(int id,String name,String description,double _price,int _stokAmount,String renk)
    {
        System.out.println("Yapıcı blok çalıştı");

        this._renk=renk;
        this._id=id;
        this._name=name;
        this._description=description;
        this._price=_price;
        this._stokAmount=_stokAmount;
    }

    //Attribute ! field
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stokAmount;
    private String _renk;
    private String _kod;

    //getter
    public int getID()
    {
        return _id;
    }
    //setter
    public void SetID(int id)
    {
        _id=id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        this._name = name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String description) {
        this._description = description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double price) {
        this._price = price;
    }

    public int get_stokAmount() {
        return _stokAmount;
    }

    public void set_stokAmount(int stokAmount) {
        this._stokAmount = stokAmount;
    }

    public String get_renk() {
        return _renk;
    }

    public void set_renk(String renk) {
        this._renk = renk;
    }

    public String get_kod() {
        return _kod;
    }

    public void set_kod(String kod) {
        this._kod = kod;
    }
}
