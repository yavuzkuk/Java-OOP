package Encapsulation;

public class teacher
{
    private String name;
    private String surname;
    public int no;

    void setName(String name)
    {
        this.name = name;
    }
    void setSurname(String surname)
    {
        this.surname = surname;
    }


    String getName()
    {
        return this.name;
    }
    String getSurname()
    {
        return this.surname;
    }



}
