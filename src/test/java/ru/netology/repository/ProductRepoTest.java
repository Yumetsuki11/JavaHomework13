package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepo;

public class ProductRepoTest {
    ProductRepo repo = new ProductRepo();
    Book book = new Book(1, "Египетская книга мёртвых", 300, "Эрнест Бадж");
    Smartphone phone = new Smartphone(2, "Redmi 9", 15_000, "Xiaomi");
    Product unspecified = new Product(5, "хлеб", 42);

    @BeforeEach
    public void setup() {
        repo.save(book);
        repo.save(phone);
        repo.save(unspecified);
    }

    @Test
    public void shouldSaveAndReturn() {
        Product[] expected = {book, phone, unspecified};
        Assertions.assertArrayEquals(expected, repo.findAll());
    }

    @Test
    public void shouldRemoveById() {
        Product[] expected = {book, unspecified};
        repo.removeById(2);
        Assertions.assertArrayEquals(expected, repo.findAll());
    }
}
