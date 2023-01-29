package Encapsulation;

public class Main {
    public static void main(String[] args)
    {
        teacher t1 = new teacher();
        t1.no= 10;

        t1.setName("Zeynep");
        t1.setSurname("Gülde");

        System.out.println(t1.getName());
        System.out.println(t1.getSurname());



    }



}