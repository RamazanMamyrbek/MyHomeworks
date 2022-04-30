package polymorphizm;

public class Faculty extends Employee{
    public int rank;
    public String[] office_hours;

    public Faculty(){}
    public Faculty(String[] office_hours, int rank){

    this.rank = rank;
    this.office_hours = office_hours;
    }
    public Faculty(String office, double salary, MyDate date_hired,String[] office_hours, int rank){
        super( office, salary,date_hired);
        this.rank = rank;
        this.office_hours = office_hours;
    }

    public void setRank(int rank){this.rank = rank;}
    public void setOfficeHours(String[] office_hours){this.office_hours = office_hours;}

    public int getRank(){return rank;}
    public String[] getOfficeHours(){return office_hours;}





}
