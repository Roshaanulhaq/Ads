package com.example.ads;

import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;

import com.google.android.gms.ads.NativeExpressAdView;

import androidx.appcompat.app.AppCompatActivity;

public class NativeAd  extends  AppCompatActivity{

    private NativeExpressAdView nativeExpressAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nativead);
        nativeExpressAdView=(NativeExpressAdView)findViewById(R.id.Native);

        AdRequest adRequest=new AdRequest.Builder().build();
        nativeExpressAdView.loadAd(adRequest);


    }
}
