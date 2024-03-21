package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class AnimalParametersTest {
    private final String animalKind;
    private final List<String> animalFood;

    public AnimalParametersTest(String animalKind, List<String> animalFood) {
        this.animalKind = animalKind;
        this.animalFood = animalFood;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Чужой", List.of("Питается от сети")},
        };
    }
    @Test
    public void getFoodTest(){
        try {
            Animal animal = new Animal();
            assertEquals(animalFood,animal.getFood(animalKind));
        } catch (Exception e) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник",e.getMessage());
        }
    }
}
