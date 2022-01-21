package OopIntro_1.Odev3_1;

public class Instructer extends User{
    private String course;
    private String teacher;

    public Instructer(int id, String firstName, String lastName,String password , String course, String teacher) {
        super(id, firstName, lastName,password);
        this.course=course;
        this.teacher=teacher;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Instructer{" +
                "course='" + course + '\'' +
                ", teacher='" + teacher + '\'' + "id"+ getId() + "student name " + getFirstName()+ "lastname " + getLastName() +
                '}';
    }
}
