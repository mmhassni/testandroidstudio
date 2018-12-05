package com.example.messaoud.simulationwhatsapp;


import android.Manifest;
import android.app.Activity;
import android.os.Message;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends Activity {


    public static ArrayList<User> panier = new ArrayList<User>() ;

    ArrayList<User> contacts ;
    ListView list;
    CustomAdapter adapter;

    public final static String EXTRA_MESSAGE = "com.ltm.ltmactionbar.CATEGORIE";

    private static final int CAMERA_REQUEST = 1888;
    private ImageView imageView;
    private static final int MY_CAMERA_PERMISSION_CODE = 100;
    public static Boolean estConnecte;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        MainActivity.estConnecte = false;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        contacts = new ArrayList<User>();

        //contacts.add(new User("Mouad","Disponible ",R.drawable.mouad));

        //adapter = new CustomAdapter(getApplicationContext(),contacts);
        //list.setAdapter(adapter);


        this.imageView = (ImageView)this.findViewById(R.id.imageView1);

        Button photoButton = (Button) this.findViewById(R.id.ajouter);


        photoButton.setOnClickListener(new View.OnClickListener() {

            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {

                if(((EditText) findViewById (R.id.editTextName)).getText().toString().equals(((EditText) findViewById (R.id.editTextStatut)).getText().toString())  && ((EditText) findViewById (R.id.editTextStatut)).getText().toString().equals("SIG")){

                    MainActivity.estConnecte = true;

                }
                else{
                    //retourner à false
                    MainActivity.estConnecte = false;

                }

                if(MainActivity.estConnecte){

                    Intent intent= new Intent(getApplicationContext(),Activity2.class);
                    startActivity(intent);

                }

            }
        });

    }

    /*

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == MY_CAMERA_PERMISSION_CODE) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "camera permission granted", Toast.LENGTH_LONG).show();
                Intent cameraIntent = new
                        Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_REQUEST);
            } else {
                Toast.makeText(this, "camera permission denied", Toast.LENGTH_LONG).show();
            }

        }


    }
    */


    /*

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");

            //imageView.setImageBitmap(photo);

            contacts.add(new User(((EditText) findViewById (R.id.editTextName)).getText().toString(),((EditText) findViewById (R.id.editTextStatut)).getText().toString(), photo ));


            //CustomAdapter est une classe qu'on a créé nous meme à partir de la classe ArrayAdapter<User>
            adapter = new CustomAdapter(getApplicationContext(),contacts);

            //ici list est un objet de type ListView qu'on a créé à traver du xml
            list.setAdapter(adapter);

        }
    }
    */


}