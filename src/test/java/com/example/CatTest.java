package com.example;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private Cat cat;
    @Mock
    Feline feline;
    @Mock
    Predator predator;
    @Before
    public void setUp() {
        cat = new Cat(feline);
    }
    @Test
    public void getSoundTest() {
        cat.getSound();
        assertEquals("Некорректное значение: ","Мяу", cat.getSound());
    }
    @Test
    public void getFoodTest() throws Exception {
        cat.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
        assertEquals(predator.eatMeat(),cat.getFood());
    }
}
