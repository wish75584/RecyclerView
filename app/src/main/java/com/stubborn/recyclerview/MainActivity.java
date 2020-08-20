package com.stubborn.recyclerview;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Model> list;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        list = new ArrayList<>();

        list.add(new Model("Title", R.drawable.one));
        list.add(new Model("Title", R.drawable.one));
        list.add(new Model("Title", R.drawable.one));
        list.add(new Model("Title", R.drawable.one));
        list.add(new Model("Title", R.drawable.one));
        list.add(new Model("Title", R.drawable.one));
        list.add(new Model("Title", R.drawable.one));
        list.add(new Model("Title", R.drawable.one));
        list.add(new Model("Title", R.drawable.one));

        adapter = new Adapter(MainActivity.this,list);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(adapter);
    }
}
