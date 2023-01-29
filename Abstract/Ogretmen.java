package Abstract;

public class Ogretmen extends KisiselAbstract
{
    Ogretmen(String name,String surname,int age)
    {
        super(name,surname,age);
    }

    @Override
    void introduce()
    {
        System.out.println("Ben öğretmenim");
    }
}
