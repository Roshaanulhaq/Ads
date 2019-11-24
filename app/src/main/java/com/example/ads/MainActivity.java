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

public class MainActivity extends AppCompatActivity {

    private AdView myadd;
    private InterstitialAd myint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //banner
        TextView banner = findViewById(R.id.textView5);
        banner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),banner.class);
                startActivity(i);
            }
        });
        //native
                TextView txt = findViewById(R.id.textView3);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),NativeAd.class);
                startActivity(i);
            }
        });
        //rewarded
        TextView txt2 = findViewById(R.id.textView4);
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(i);
            }
        });

        MobileAds.initialize(this,"ca-app-pub-3940256099942544~3347511713");

        myint = new InterstitialAd(this);
        myint.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        AdRequest adrequest2 = new AdRequest.Builder().build();
        myint.loadAd(adrequest2);

    }

    public void displayadds(View view) {

        if(myint.isLoaded())
        {
            myint.show();
        }
        else
            Toast.makeText(getApplicationContext(),"Add not loaded",Toast.LENGTH_SHORT).show();
   }
}
