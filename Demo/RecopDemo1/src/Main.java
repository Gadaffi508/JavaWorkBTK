public class Main {
    public static void main(String[] args) {
        int x=15,y=20,z=30;
        if (x>y && x>z)
        {
            System.out.print("x en büyük sayı :" + x);
        }
        else if(y>x && y>z)
        {
            System.out.print("y en büyük sayı :" + y);
        }
        else
        {
            System.out.print("z en büyük sayı :" + z);
        }
    }
}