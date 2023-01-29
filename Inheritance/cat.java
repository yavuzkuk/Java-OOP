package Inheritance;

public class cat extends Animal
{
    public int age;

    cat(String name,int age)
    {
       super(name);
       this.age = age;
    }


    void meow()
    {
        System.out.println("kedi miyavladı");
    }

    @Override
    void eat() {
        System.out.println("kedi yemek yedi");
    }
}
