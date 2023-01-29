package Interface;

public class Ogretmen extends Kisisel implements IEylem
{
    Ogretmen(String name,String surname,int age)
    {
        super(name,surname,age);
    }

    @Override
    public void walk() {
        System.out.println("Ogretmen yürür");
    }

    @Override
    public void eat() {
        System.out.println("Ogretmen yer");
    }

    @Override
    public void sleep() {
        System.out.println("Ogretmen uyur");
    }
}
