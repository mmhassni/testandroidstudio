package com.example.messaoud.simulationwhatsapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity2 extends AppCompatActivity {



    ArrayList<User> contacts ;
    ListView list;
    CustomAdapter adapter;
    public static int categorieEnCours;
    public static ArrayList<User>[] View;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        contacts = new ArrayList<User>();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        contacts.add(new User("accessoire","", R.drawable.accessoire ));
        contacts.add(new User("magazine","", R.drawable.magazine ));
        contacts.add(new User("menager","", R.drawable.menager ));
        contacts.add(new User("ordinateur","", R.drawable.ordinateur ));
        contacts.add(new User("portable","", R.drawable.portable ));


        //CustomAdapter est une classe qu'on a créé nous meme à partir de la classe ArrayAdapter<User>

        adapter = new CustomAdapter(getApplicationContext(),contacts);


        //il sagit de la liste qu'on veut remplir (c'est une vue)
        list = (ListView) findViewById(R.id.contacts);


        list.setAdapter(adapter);




        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {



            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Activity2.categorieEnCours = position;

                Intent intent= new Intent(getApplicationContext(),Activity3.class);
                intent.putExtra("Categorie", contacts.get(position).getName());
                startActivity(intent);

                //on va changer le text de nom
                //((EditText) findViewById (R.id.editTextName)).setText(contacts.get(position).getName());



            }

        });


        //Bitmap photo = (Bitmap) data.getExtras().get("data");

        //imageView.setImageBitmap(photo);

        //contacts.add(new User(((EditText) findViewById (R.id.editTextName)).getText().toString(),((EditText) findViewById (R.id.editTextStatut)).getText().toString(), photo ));


        //CustomAdapter est une classe qu'on a créé nous meme à partir de la classe ArrayAdapter<User>
        //adapter = new CustomAdapter(getApplicationContext(),contacts);

        //ici list est un objet de type ListView qu'on a créé à traver du xml
        //list.setAdapter(adapter);



    }
}
