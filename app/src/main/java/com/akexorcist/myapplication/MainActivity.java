package com.akexorcist.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> itemList = new ArrayList<>();
        itemList.add("Ake");
        itemList.add("Trust");
        itemList.add("Palakorn");
        itemList.add("Nextzy");
        itemList.add("Chai");
        itemList.add("Somkiat");
        itemList.add("Juthamas");
        itemList.add("Panupak");
        itemList.add("Pusadee");


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new SimpleAdapter(itemList));


    }
}
