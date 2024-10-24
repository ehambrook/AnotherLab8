package com.example.lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // Declare the variables so that you will be able to reference it later.
    ListView cityList;
    ArrayAdapter<City> cityAdapter;
    ArrayList<City> cityDataList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cityList = findViewById(R.id.city_list);
        cityDataList = new ArrayList<>();

        cityDataList.add(new City("Edmonton","AB", 1));
        cityDataList.add(new City("Vancouver","BC", 2));
        cityDataList.add(new City("Toronto","ON", 3));
        cityDataList.add(new City("Hamilton","ON", 4));
        cityDataList.add(new City("Calgary","AB", 5));
        cityDataList.add(new City("Waterloo","ON", 6));


        cityAdapter = new CustomList(this,cityDataList);
        cityList.setAdapter(cityAdapter);

    }
}