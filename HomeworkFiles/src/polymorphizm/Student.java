package polymorphizm;

public class Student extends Person{
    public static final String SENIOR = "Senior";
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public String status;
    public Student(){}
    public Student(String status){this.status = status;}

    public void setStatus(String status){this.status = status;}

    public String getStatus(){return status;}



}
