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
        itemList.add("Ant");
        itemList.add("Bird");
        itemList.add("Cat");
        itemList.add("Dog");
        itemList.add("Elephant");
        itemList.add("Fish");
        itemList.add("Giraffe");
        itemList.add("Hen");
        itemList.add("Ice-cream");
        itemList.add("Jaguar");
        itemList.add("Kingkong");
        itemList.add("Lion");
        itemList.add("Man");


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new SimpleAdapter(itemList));


    }
}
