package com.example.rob.dcomproject;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LeagueTables extends AppCompatActivity{




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_league_tables);

        Button leaguebth = (Button) findViewById(R.id.preDiv);
        leaguebth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), RandomLeague.class);
                startActivityForResult(intent, 0);
            }
        });

    }





}
