package com.example.placetoplace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Item5 extends AppCompatActivity {
    Button btnUnionB;
    String sSource, sDestination;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item5);

        btnUnionB = findViewById(R.id.btnUnionB);

        sSource = "628 Reitz St, Sunnyside, Pretoria, 0002";
        sDestination = "Union Buildings";

        btnUnionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if maps is not installed redirect to playstore
                try {
                    //when installed then...
                    Uri uri = Uri.parse("https://www.google.co.in/maps/dir/" +
                            sSource + "/" + sDestination);
                    //initialize intent with action view
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    //set package
                    intent.setPackage("com.google.android.apps.maps");
                    //set flag
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //start activity
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    //when google maps not installed initialize uri
                    Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
                    //initialize intent
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    //set flag
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //start activity
                    startActivity(intent);
                }
            }
        });
    }
}