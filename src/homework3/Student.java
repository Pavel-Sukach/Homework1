package homework3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String surname;
    private String dateOfBirthday;
    private int course;

    public Student(String name, String surname, String dateOfBirthday, int course){
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;
        this.course = course;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getDateOfBirthday(){
        return dateOfBirthday;
    }
    public void setDateOfBirthday(String dateOfBirthday){
        this.dateOfBirthday = dateOfBirthday;
    }
    public int getCourse(){
        return course;
    }
    public void setCourse(int course){
        this.course = course;
    }

    public static void printStudents(List<Student> students, int course){
        for(Student student: students){
            if(course == student.course){
                System.out.println(student.name);
            }
        }
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Pablo", "Vaskes", "17-06-1987", 1));
        students.add(new Student("Diego", "Gonzanes", "23-11-1993", 3));
        students.add(new Student("Federico", "Gomes", "11-02-2000", 5));
        students.add(new Student("Angel", "Ruiz", "02-04-1991",1));
        printStudents(students, 1);
    }
}
