package Abstract;

public class Memur extends KisiselAbstract
{
    Memur(String name,String surname,int age)
    {
        super(name,surname,age);
    }

    @Override
    void introduce()
    {
        System.out.println("Memurum");
    }
}
