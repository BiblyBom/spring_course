package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Рождественские каникулы")
    private String title;

    @Value("Сомерсет Моэм")
    private String author;

    @Value("1949")
    private int yearOfPublication;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
