package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class SecurityAspect {

    @Pointcut("execution (* get*(..))")
    public void getMethods(){}

    @Before("getMethods()")
    public void beforeGetBookSecurityAdvice() {
        System.out.println("beforeGetBookSecurityAdvice: проверка допуска");
        System.out.println("-----------------------------------------");
    }
}
