package OopIntro_1.Odev3_1;

public class InstructorManager  {
    public void addCourseName(Instructer instructer, String course, String teacher){
       System.out.println("Course " + instructer.getCourse()+
                        "and course teacher " + instructer.getTeacher());
        instructer.setCourse(course);
        instructer.setTeacher(teacher);

    }



}
