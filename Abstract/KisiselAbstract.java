package Abstract;

public abstract class KisiselAbstract
{
    public String name;
    public String surname;
    public int age;

    KisiselAbstract(String name,String surname,int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    void sayHello()
    {
        System.out.println("Merhaba");
    }

    abstract void introduce();


}
