package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        LibraryNumberOne libraryNumberOne = context.getBean("libraryBean", LibraryNumberOne.class);
        String book = libraryNumberOne.returnBook();
        System.out.println(book);
        System.out.println("Method main ends");
        context.close();
    }
}
