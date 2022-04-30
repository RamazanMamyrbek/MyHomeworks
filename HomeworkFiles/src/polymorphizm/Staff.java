package polymorphizm;

public class Staff extends Employee{
    public String title;

    public Staff(){}
    public Staff(String title){this.title = title;}
    public Staff(String office, double salary, MyDate date_hired, String title){
        super(office, salary, date_hired);
        this.title = title;
    }

    public void setTitle(String title){this.title = title;}

    public String getTitle(){return this.title;}


}
