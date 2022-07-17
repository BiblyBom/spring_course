package aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class LibraryNumberOne extends AbstractLibrary {
    public void getBook(String bookName) {
        System.out.println("Книга \"" + bookName + "\" выдана из библиотеки №1");
        System.out.println("--------------------------------------");
    }

    public String returnBook() {
        System.out.println("Книга возвращена");
        return "Процесс. Кафка";
    }

    public void getMagazin(String magazineName) {
        System.out.println("Журнал \"" + magazineName + "\" выдан");
        System.out.println("--------------------------------------");
    }

    public void returnMagazine(String magazineName) {
        System.out.println("Журнал \"" + magazineName + "\" возвращён");
        System.out.println("--------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Книга добавлена");
        System.out.println("--------------------------------------");
    }

    public void addMagazine(String magazineName) {
        System.out.println("Журнал \"" + magazineName + "\" добавлен");
        System.out.println("--------------------------------------");
    }
}
