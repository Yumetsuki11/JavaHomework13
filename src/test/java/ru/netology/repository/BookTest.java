package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;

public class BookTest {
    Book book = new Book(1, "Египетская книга мёртвых", 300, "Эрнест Бадж");

    @Test
    public void shouldReturnTrueWhenOnlyNameMatches() {
        boolean actual = book.matches("Египет");
        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldReturnFalseWhenNoMatchesInBothFields() {
        boolean actual = book.matches("vj9w04vj");
        Assertions.assertTrue(!actual);
    }

    @Test
    public void shouldReturnTrueWhenOnlyAuthorMatches() {
        boolean actual = book.matches("ад");
        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldReturnTrueWhenBothMatch() {
        boolean actual = book.matches("е");
        Assertions.assertTrue(actual);
    }
}
