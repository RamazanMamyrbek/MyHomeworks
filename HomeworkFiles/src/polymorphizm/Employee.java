package polymorphizm;

public class Employee extends Person{
    public String office;
    public double salary;
    public MyDate date_hired;
    public Employee(){}
    public Employee(String office, double salary, MyDate date_hired){
        this.office = office;
        this.salary = salary;
        this.date_hired = date_hired;
    }

    public void setOffice(String office){ this.office = office;}
    public void setSalary(double salary){ this.salary = salary;}
    public void setDate_hired(MyDate date_hired){this.date_hired = date_hired;}

    public String getOffice(){ return office;}
    public double getSalary(){ return salary;}
    public MyDate getDate_hired(){ return date_hired;}



}
