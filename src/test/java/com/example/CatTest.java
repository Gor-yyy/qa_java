package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void getSoundReturnsMeow() {
        Cat cat = new Cat(feline);

        String actual = cat.getSound();

        assertEquals("Мяу", actual);
    }

    @Test
    public void getFoodReturnsFoodFromFeline() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        when(feline.eatMeat()).thenReturn(expected);

        Cat cat = new Cat(feline);

        List<String> actual = cat.getFood();

        assertEquals(expected, actual);
    }
}