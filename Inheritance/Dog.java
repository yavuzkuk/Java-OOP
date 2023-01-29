package Inheritance;

public class Dog extends Animal
{

    public int age;

    Dog(String name,int age)
    {
        super(name);
        this.age = age;
    }



    void havla()
    {
        System.out.println("havla");
    }

    @Override
    void eat() {
        System.out.println("köpek yemek yedi");
    }
}