package OopIntro_1.Odev3_1;

public class StudentManager  {
    public  void addCourse(Instructer instructer){
        System.out.println("Instructor Id     " + instructer.getId()+
                "\nName           " + instructer.getFirstName()+
                "\nLast Name      " + instructer.getLastName()+
                "\nPassword       " + instructer.getPassword() +
                "\nCourse Name    " + instructer.getCourse() +
                "\nCourse Teacher " + instructer.getTeacher()+
                "\nThe Course has been added");
    }

    public  void addCourse(Instructer[] instructer){
        for (Instructer instructer1 : instructer){
            System.out.println("Instructor Id     " + instructer1.getId()+
                    "\nName           " + instructer1.getFirstName()+
                    "\nLast Name      " + instructer1.getLastName()+
                    "\nPassword       " + instructer1.getPassword() +
                    "\nCourse Name    " + instructer1.getCourse() +
                    "\nCourse Teacher " + instructer1.getTeacher()+
                    "\nThe Course has been added");

        }
    }

    public void deleteCourse(Instructer instructer){
        System.out.println("Instructor Id     " + instructer.getId()+
                "\nName           " + instructer.getFirstName()+
                "\nLast Name      " + instructer.getLastName()+
                "\nPassword       " + instructer.getPassword() +
                "\nCourse Name    " + instructer.getCourse() +
                "\nCourse Teacher " + instructer.getTeacher()+
                "\nThe Course has been deleted.");
    }

    public  void deleteCourse(Instructer[] instructer){
        for (Instructer instructer1 : instructer){
            System.out.println("Instructor Id     " + instructer1.getId()+
                    "\nName           " + instructer1.getFirstName()+
                    "\nLast Name      " + instructer1.getLastName()+
                    "\nPassword       " + instructer1.getPassword() +
                    "\nCourse Name    " + instructer1.getCourse() +
                    "\nCourse Teacher " + instructer1.getTeacher()+
                    "\nThe Course has been deleted.");

        }
    }


}
