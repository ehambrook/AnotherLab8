package com.example.lab8;

public class City {

    private String city;
    private String province;
    private int id;

    public City(String city, String province){
        this.city = city;
        this.province = province;
        this.id = id;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    int getId() {
        return this.id;
    }


    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }
}
