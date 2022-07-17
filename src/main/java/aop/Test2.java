package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("university", University.class);
        university.addStudents();
        try {List<Student> studentList = university.getStudents();
        System.out.println(studentList);}
        catch (IndexOutOfBoundsException e) {
            System.out.println("Поймано исключение: нет такого индекса");
        }
        context.close();
    }
}
