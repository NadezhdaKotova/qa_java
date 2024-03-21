package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static java.lang.invoke.MethodHandles.catchException;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private Lion lion;
    @Mock
    Feline feline;
    @Test
    public void testGetKittens() throws Exception {
        when(feline.getKittens()).thenReturn(2);
        lion = new Lion("Самка", feline);
        lion.getKittens();
        assertEquals(2,lion.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        lion = new Lion("Самец", feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"),lion.getFood());
    }

}
