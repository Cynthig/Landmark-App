package com.example.placetoplace;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

public class Item1 extends AppCompatActivity {
    Button btnCaptureSite;
    String sSource, sDestination;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item1);

        btnCaptureSite = findViewById(R.id.btnCaptureSite);

        sSource = "628 Reitz St, Sunnyside, Pretoria, 0002";
        sDestination = "Nelson Mandela Capture Site";

        btnCaptureSite.setOnClickListener(new View.OnClickListener() {
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