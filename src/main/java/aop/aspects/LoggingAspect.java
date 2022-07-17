package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class LoggingAspect {

//    @Pointcut("execution (* aop.Library.get*(..))")
//    private void allGetMethodsFromLibrary() {
//    }
//
//    @Pointcut("execution (* aop.Library.return*(..))")
//    private void allReturnMethodsFromLibrary(){
//    }
//
//    @Pointcut("allGetMethodsFromLibrary() || allReturnMethodsFromLibrary()")
//    private void allGetAndReturnMethodsFromLibrary() {
//
//    }
//
//    @Before("allGetMethodsFromLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }


    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddBookLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println(methodSignature);
        System.out.println("Method: " + methodSignature.getMethod());
        System.out.println("ReturnType: " + methodSignature.getReturnType());
        System.out.println("Name: " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj: arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Информация: название книги - " +
                            myBook.getTitle() + ", автор книги - " + myBook.getAuthor() + ", год издания - "
                            + myBook.getYearOfPublication());
                }
                else if (obj instanceof String) {
                    System.out.println("Книгу добавляет: " + obj);
                }
            }
        }



        System.out.println("beforeAddBookAdvice: попытка добавить книгу / журнал");
        System.out.println("-----------------------------------------");
    }
}
