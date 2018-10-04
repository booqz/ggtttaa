package com.codes_cheats_samp_sanandreas.gg.odesgtasanandreas;
import android.content.pm.ActivityInfo;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
public class MainActivity extends AppCompatActivity {
    public static FragmentManager fragmentManager;
    private static final String TAG = "MainActivity";
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        fragmentManager = getSupportFragmentManager();
        if (findViewById(R.id.fragment_container)!=null){
            if (savedInstanceState!=null){
                return;
            }
            fragmentManager.beginTransaction().add(R.id.fragment_container, new Category()).commit();
        }
    }
}