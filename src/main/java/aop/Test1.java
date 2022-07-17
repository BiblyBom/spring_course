package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        LibraryNumberOne library = context.getBean("libraryBean", LibraryNumberOne.class);
        Book book = context.getBean("book", Book.class);
        library.getBook("Дорога в тысячу ли");
        library.getMagazin("Harper's Bazaar");
        library.returnBook();
        library.addBook("Maxim", book);
        library.addMagazine("Men's Health");

        context.close();
    }
}
