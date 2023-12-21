package com.example.midexam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentA fragmentA = new FragmentA();
        FragmentB fragmentB = new FragmentB();
        fragmentA.setArguments(getIntent().getExtras());

        fragmentManager.beginTransaction()
                .replace(R.id.fragment_A, fragmentA)
                .setReorderingAllowed(true)
                .addToBackStack("FragmentA")
                .commit();

        fragmentManager.beginTransaction()
                .replace(R.id.fragment_B, fragmentB)
                .setReorderingAllowed(true)
                .addToBackStack("FragmentB")
                .commit();


    }
}