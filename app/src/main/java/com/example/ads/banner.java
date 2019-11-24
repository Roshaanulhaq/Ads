package com.example.ads;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class banner extends AppCompatActivity {

    private AdView myadd;
    private InterstitialAd myint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner);



        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");

        myadd = (AdView) findViewById(R.id.adView);
        AdRequest adrequest = new AdRequest.Builder().build();
        myadd.loadAd(adrequest);

//        myint = new InterstitialAd(this);
//        myint.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
//        AdRequest adrequest2 = new AdRequest.Builder().build();
//        myint.loadAd(adrequest2);
//
//    }
//
//    public void displayadds(View view) {
//
//        if (myint.isLoaded()) {
//            myint.show();
//        } else
//            Toast.makeText(getApplicationContext(), "Add not loaded", Toast.LENGTH_SHORT).show();

    }
}