package FinalQ1;

public class FreelanceDeveloper extends Developer implements IBonusSalaryBehaviour
{
    int unitPrice = 2;
    int hours;

    FreelanceDeveloper(int id,String fullName,int hours)
    {
        super(id,fullName);
        this.hours = hours;
    }


    @Override
    double income() {
        return hours*unitPrice+getBonusSalary();
    }

    @Override
    public double getBonusSalary() {
        return hours*1.5;
    }
}
