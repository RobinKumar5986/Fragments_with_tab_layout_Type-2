package com.example.haider.fragmentswithtablayouttype_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();

        //----------Locating the viewPager and Tab Layout--------//
        tabLayout=findViewById(R.id.tabMain);
        viewPager=findViewById(R.id.viewPager);
        //-----------------------------------------------------//
        FragmentManager manager=getSupportFragmentManager();
        viewPager.setAdapter(new fragmentAdapter(manager));
        tabLayout.setupWithViewPager(viewPager);
    }
}