package com.example.messaoud.simulationwhatsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);


        //CustomAdapter est une classe qu'on a créé nous meme à partir de la classe ArrayAdapter<User>

        CustomAdapter adapter = new CustomAdapter(getApplicationContext(),MainActivity.panier);


        //il sagit de la liste qu'on veut remplir (c'est une vue)
        ListView list = (ListView) findViewById(R.id.panierList);


        list.setAdapter(adapter);
    }


}
