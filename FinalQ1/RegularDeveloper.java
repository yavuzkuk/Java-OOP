package FinalQ1;

public class RegularDeveloper extends Developer
{

    double monthlySalary;

    RegularDeveloper(int id,String fullName,double monthlySalary)
    {
        super(id,fullName);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double income()
    {
        return monthlySalary;
    }
}
