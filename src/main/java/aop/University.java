package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("Maxim Boyev", 3, 4.3);
        Student st2 = new Student("Elena Prekrasnaya", 2, 4.7);
        Student st3 = new Student("Michael Jackson", 4, 3.9);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Старт работы метода");
        System.out.println(students.get(3));
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }

}
