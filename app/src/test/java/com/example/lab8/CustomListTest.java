package com.example.lab8;

import static junit.framework.TestCase.assertEquals;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    /**
     * create a mocklist for my citylist
     * @return list object
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK", 7));
        assertEquals(list.getCount(),listSize + 1);

    }

    @Test
    public void testHasCity() {
        CustomList cityList = MockCityList();

        City city = new City("Edmonton", "Alberta", 7);
        cityList.addCity(city);

        assertTrue(cityList.hasCity(city));
    }

    @Test
    public void testDeleteCity() {
        CustomList cityList = MockCityList();

        City city = new City("Edmonton", "AB", 8);

        cityList.addCity(city);
        cityList.deleteCity(city);

        assertFalse(cityList.hasCity(city));
    }

    @Test
    public void testCountCities() {
        CustomList cityList = MockCityList();

        assertEquals(0, cityList.countCities());

        City calgary = new City("Calgary", "AB", 2);
        City toronto = new City("Toronto", "ON", 3);
        cityList.addCity(calgary);
        cityList.addCity(toronto);

        assertEquals(2, cityList.countCities());
    }
}
