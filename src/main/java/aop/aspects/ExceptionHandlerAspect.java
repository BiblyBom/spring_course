package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class ExceptionHandlerAspect {
@Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlerAdvice () {
    System.out.println("beforeAddExceptionHandlerAdvice: " +
            "ловим исключение при попытке добавить книгу/журнал");
    System.out.println("-----------------------------------------");
}
}
