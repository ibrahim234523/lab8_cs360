package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest
{
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        list.deleteCity(calgary);
        assertFalse(list.hasCity(calgary));
    }

    @Test
    public void countCities_returnsCorrectNumber()
    {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Lahore", "Punjab");
        list.addCity(calgary);
        list.addCity(edmonton);
        assertEquals(2, list.countCities());
    }
}
