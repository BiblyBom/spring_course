package aop;

public class LibraryNumberTwo extends AbstractLibrary{
    @Override
    public void getBook(String bookName) {
        System.out.println("Книга \"" + bookName + "\" выдана из библиотеки №2");
    }
}
