package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    private final Feline feline = new Feline();

    @Test
    public void eatMeatReturnsPredatorFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        List<String> actual = feline.eatMeat();

        assertEquals(expected, actual);
    }

    @Test
    public void getFamilyReturnsCatsFamily() {
        String expected = "Кошачьи";

        String actual = feline.getFamily();

        assertEquals(expected, actual);
    }

    @Test
    public void getKittensWithoutParameterReturnsOne() {
        int expected = 1;

        int actual = feline.getKittens();

        assertEquals(expected, actual);
    }

    @Test
    public void getKittensWithParameterReturnsGivenCount() {
        int expected = 3;

        int actual = feline.getKittens(3);

        assertEquals(expected, actual);
    }
}