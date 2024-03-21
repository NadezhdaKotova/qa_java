package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    private Feline feline;

    @Test
    public void eatMeatTest() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
        assertEquals(feline.getFood("Хищник"),feline.eatMeat());
    }
    @Test
    public void getFamilyTest() {
        feline.getFamily();
        Mockito.verify(feline, Mockito.times(1)).getFamily();
        assertEquals("Семейство некорректно","Кошачьи",feline.getFamily());
    }
    @Test
    public void getKittensWithoutArgsTest() {
        feline.getKittens();
        Mockito.verify(feline,Mockito.times(1)).getKittens();
        assertEquals("Неверное количество котят", feline.getKittens(1), feline.getKittens());
    }
    @Test
    public void getKittensWithArgsTest() {
        Feline feline = new Feline();
        feline.getKittens(6);
        assertEquals("Неверное количество котят", 6, feline.getKittens(6));
    }
}
