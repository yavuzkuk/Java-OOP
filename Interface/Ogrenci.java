package Interface;

public class Ogrenci extends Kisisel implements IEylem
{
    Ogrenci(String name,String surname,int age)
    {
        super(name,surname,age);
    }

    @Override
    public void walk() {
        System.out.println(this.name +" Ogrenci yürür");
    }

    @Override
    public void eat() {
        System.out.println("Ogrenci yer");
    }

    @Override
    public void sleep() {
        System.out.println("Ogrenci uyur");
    }
}
