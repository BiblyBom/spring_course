package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: получение списка студентов" +
//                "перед методом getStudents");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//        Student student1 = students.get(0);
//
//        String name = student1.getNameSurname();
//        name = "Mr. " + name;
//        student1.setNameSurname(name);
//
//        double avg = student1.getAvgGrade();
//        avg = avg + 1;
//        student1.setAvgGrade(avg);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: " +
//                "успешное получение списка студентов");
//
//    }

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    public void beforeGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("логирование исключения " + exception);
    }
}
