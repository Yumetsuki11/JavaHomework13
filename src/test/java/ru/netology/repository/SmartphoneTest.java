package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Smartphone;

public class SmartphoneTest {
    Smartphone phone = new Smartphone(2, "Redmi 9", 15_000, "Xiaomi");

    @Test
    public void shouldReturnTrueWhenOnlyNameMatches() {
        boolean actual = phone.matches(" 9");
        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldReturnFalseWhenNoMatchesInBothFields() {
        boolean actual = phone.matches("vj9w04vj");
        Assertions.assertTrue(!actual);
    }

    @Test
    public void shouldReturnTrueWhenOnlyBrandMatches() {
        boolean actual = phone.matches("Xi");
        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldReturnTrueWhenBothMatch() {
        boolean actual = phone.matches("mi");
        Assertions.assertTrue(actual);
    }
}
