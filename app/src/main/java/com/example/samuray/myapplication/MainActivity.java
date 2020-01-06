package com.example.samuray.myapplication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction t = manager.beginTransaction();
        Myfrag1 m1 = new Myfrag1();
        t.add(R.id.frame1, m1);
        t.commit();
    }

    public void fl(String s) {

        FragmentManager manager1 = getSupportFragmentManager();
        FragmentTransaction t1 = manager1.beginTransaction();

        Myfrag2 m2 = new Myfrag2();
        Bundle b2 = new Bundle();
        b2.putString("s", s);
        m2.setArguments(b2);


        t1.replace(R.id.frame1, m2);
        t1.commit();

    }
}
