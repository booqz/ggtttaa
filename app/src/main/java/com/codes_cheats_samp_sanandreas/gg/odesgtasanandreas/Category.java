package com.codes_cheats_samp_sanandreas.gg.odesgtasanandreas;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;


/**
 * A simple {@link Fragment} subclass.
 */
public class Category extends Fragment implements View.OnClickListener{
LinearLayout category1,category2,category3,category4;
    private InterstitialAd mInterstitialAd;
    int adsInt=0;

    public Category() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_category, container, false);

        MobileAds.initialize(getActivity(),
               "ca-app-pub-3861995689830617~8523233648");

      //  MobileAds.initialize(getActivity(),
       //         "ca-app-pub-3940256099942544~3347511713");

        mInterstitialAd = new InterstitialAd(getActivity());
        mInterstitialAd.setAdUnitId("ca-app-pub-3861995689830617/8738856061");
       // mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());


        category1 = view.findViewById(R.id.category1);
        category2 = view.findViewById(R.id.category2);
        category3 = view.findViewById(R.id.category3);
        category4 = view.findViewById(R.id.category4);

       category1.setOnClickListener(this);
       category2.setOnClickListener(this);
       category3.setOnClickListener(this);
       category4.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.category1:
                if (adsInt ==0) {
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                        adsInt++;
                    }
                }else {
                    adsInt++;
                    if (adsInt>=3){
                        adsInt=0;
                    }
                }
                MainActivity.fragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, new Waepon_fragment())
                        .addToBackStack(null)
                        .commit();
                break;
            case R.id.category2:
                if (adsInt ==0) {
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                        adsInt++;
                    }
                }else {
                    adsInt++;
                    if (adsInt>=3){
                        adsInt=0;
                    }
                }
                MainActivity.fragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, new Weather_fragment())
                        .addToBackStack(null)
                        .commit();
                break;
            case R.id.category3:
                if (adsInt ==0) {
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                        adsInt++;
                    }
                }else {
                    adsInt++;
                    if (adsInt>=3){
                        adsInt=0;
                    }
                }
                MainActivity.fragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, new Cars_fragment())
                        .addToBackStack(null)
                        .commit();
                break;
            case R.id.category4:
                if (adsInt ==0) {
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                        adsInt++;
                    }
                }else {
                    adsInt++;
                    if (adsInt>=3){
                        adsInt=0;
                    }
                }
                MainActivity.fragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, new Other_fragment())
                        .addToBackStack(null)
                        .commit();
                break;
        }
    }
}
