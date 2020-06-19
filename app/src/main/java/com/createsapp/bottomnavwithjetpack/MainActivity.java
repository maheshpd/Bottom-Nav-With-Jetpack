package com.createsapp.bottomnavwithjetpack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    //Initialize variable
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign variable
        bottomNavigationView = findViewById(R.id.bottom_navigation);

        //Initialize nav controller
        NavController navController = Navigation.findNavController(this,R.id.fragment);

        //Setup nav controller
        NavigationUI.setupWithNavController(bottomNavigationView,navController);
    }
}