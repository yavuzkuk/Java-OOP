package Inheritance;

public class Animal
{

    private String name;

    public Animal(String name)
    {
        setName(name);
    }

    void setName(String name)
    {
        this.name = name;
    }

    String getName()
    {
        return this.name;
    }


    void eat()
    {
        System.out.println("yemek ye");
    }

    void sleep()
    {
        System.out.println("uyu");
    }


}
