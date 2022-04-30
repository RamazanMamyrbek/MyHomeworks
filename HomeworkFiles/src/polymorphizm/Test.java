package polymorphizm;

public class Test {
    public static void main(String[] args){
        Person Adam = new Person();
        Adam.setName("Adam");
        System.out.println(Adam.toString());

        Student student = new Student(Student.FRESHMAN);
        student.setName("Student");
        System.out.println(student.toString());

        Employee employee = new Employee("Office1", 50000.0, new MyDate(System.currentTimeMillis()));
        employee.setName("Employee");
        System.out.println(employee.toString());

        Faculty faculty = new Faculty(new String[]{"5:00", "3:00"}, 6);
        faculty.setName("Faculty");
        System.out.println(faculty.toString());

        Staff staff = new Staff("title");
        staff.setName("Staff");
        System.out.println(staff.toString());

    }
}
