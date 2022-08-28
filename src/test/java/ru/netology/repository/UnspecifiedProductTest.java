package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Product;

public class UnspecifiedProductTest {
    Product unspecified = new Product(5, "хлеб", 42);

    @Test
    public void shouldReturnTrueWhenNameMatches() {
        boolean actual = unspecified.matches("х");
        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldReturnFalseWhenNoMatches() {
        boolean actual = unspecified.matches("vj9w04vj");
        Assertions.assertTrue(!actual);
    }
}
