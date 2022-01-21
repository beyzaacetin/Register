package OopIntro_1.Odev3_1;

public class Student extends User{
    private String department;

    public Student(int id, String firstName, String lastName,String password , String department) {
        super(id, firstName, lastName,password);
        this.department=department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "department='" + department + '\'' +
                '}';
    }
}
