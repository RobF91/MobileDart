package com.example.rob.dcomproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class RandomLeague extends AppCompatActivity {

    ListView listview;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_league);


        String[] table = new String[] {"Position | Team      |   Played |   Points",
                                      "1.            | Tory Top | 2           |   5",
                                      "2.            | Cit           | 2           |   3"};

        listview = (ListView)findViewById(R.id.listView);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, table);
        listview.setAdapter(adapter);
    }

}
