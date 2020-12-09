package com.example.myapplication;



import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {
    public static final String MUSEUM_DETAIL_KEY = "museum"; //String for for the intent
    private ArrayAdapter museumAdapter; //Stores the drop down menu
    private Spinner MuseumSpinner; //Spinner for the dropdown menu

    /**
     * On create method for the main activity. Initialized the dropdown menu and the button
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(getString(R.string.app_name));

        MuseumSpinner = (Spinner) findViewById(R.id.spinner);

        ArrayList<Museum> museums = new ArrayList<Museum>();
        addMuseums(museums);
        museumAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, museums);
        MuseumSpinner.setAdapter(museumAdapter);
        //initializes the button
        Button button = (Button) findViewById(R.id.chooser);
        final Spinner spin = (Spinner) findViewById(R.id.spinner);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = spin.getSelectedItem().toString();

                if (text.equals("The Museum of Modern Art")) {
                    Intent intent = new Intent(MainActivity.this, MomaActivity.class);
                    startActivity(intent);
                }/* }else if(text.equals("The Natural History Museum")){
                    Intent intent=new Intent(v.getContext(), HistoryActivity.class);
                    startActivity(intent);
                }else if(text.equals("The Solomon R. Guggenheim Museum")){
                    Intent intent=new Intent(v.getContext(), GuggenheimActivity.class);
                    startActivity(intent);
                }else if(text.equals("The Metropolitan Museum of  Art")){
                    Intent intent=new Intent(v.getContext(), MetActivity.class);
                    startActivity(intent);
                }*/
            }

        });

    }

    /**
     * Get actual ticket prices
     * @param museums
     */
    private void addMuseums( ArrayList<Museum> museums ){
        museums.add(new Moma(getString(R.string.MOMA), R.drawable.moma, getString(R.string.momaurl)));
        museums.add(new Met(getString(R.string.met), R.drawable.met, getString((R.string.meturl))));
        museums.add(new Guggenheim(getString(R.string.guggenheim), R.drawable.guggenheim, getString(R.string.guggenheimurl)));
        museums.add(new NaturalHistory(getString(R.string.mnh), R.drawable.mnh, getString(R.string.mnhurl)));

    }
}
