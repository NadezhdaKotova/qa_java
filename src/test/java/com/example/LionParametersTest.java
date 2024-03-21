package com.example;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
    public class LionParametersTest {
        private final String sex;
        private final boolean hasMane;
    @Before
    public void setup(){
        feline = Mockito.mock(Feline.class);
    }

        public LionParametersTest(String sex, boolean hasMane) {
            this.sex = sex;
            this.hasMane = hasMane;
        }
        @Parameterized.Parameters
        public static Object[][] getTestData() {
            return new Object[][]{
                    {"Самец", true},
                    {"Самка", false},
                    {"Чужой", false},
            };
        }
        @Mock
        Feline feline;
        @Test
        public void doesHaveManeTest() {
            try{
                Lion lion = new Lion(sex,feline);
                lion.doesHaveMane();
                assertEquals(hasMane, lion.doesHaveMane());
            }catch (Exception e){
                assertEquals("Используйте допустимые значения пола животного - самец или самка",e.getMessage());
            }
        }
    }
