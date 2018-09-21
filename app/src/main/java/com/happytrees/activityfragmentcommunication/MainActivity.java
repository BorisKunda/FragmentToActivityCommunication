package com.happytrees.activityfragmentcommunication;


import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements OnHeadlineSelectedListener{

    TextView activityTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BlankFragment fr = new BlankFragment();
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.frContainer, fr).commit();
        activityTV = findViewById(R.id.activityTV);


    }

    @Override
    public void changeTVInActivityFromFragment() {
        activityTV.setText("fragment-> activity communication works");
    }
}
