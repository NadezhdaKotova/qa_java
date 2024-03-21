package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {
    @Mock
    private Feline feline;
    private LionAlex lionAlex;

    @Test
    public void testGetKittens() throws Exception {
        lionAlex = new LionAlex(feline);
        assertEquals("Леха не рожает - он только дружит!", 0, lionAlex.getKittens());
    }

    @Test
    public void testGetFriends() throws Exception {
        lionAlex = new LionAlex(feline);
        assertEquals("Список друзей не соответствует ожидаемому", List.of("Марти", "Глория", "Мелман"), lionAlex.getFriends());
    }

    @Test
    public void testGetPlaceOfLiving() throws Exception {
        lionAlex = new LionAlex(feline);
        assertEquals("Некорректное место проживания льва", "Нью-Йоркский зоопарк",lionAlex.getPlaceOfLiving());
    }
    @Test
    public  void doesHaveManeTest() throws Exception {
        lionAlex = new LionAlex(feline);
        lionAlex.doesHaveMane();
        assertTrue("Проблемы с гривой", lionAlex.doesHaveMane());
    }
}
