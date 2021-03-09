package com.example.layouting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.app.UiModeManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private UiModeManager uiModeManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        uiModeManager = (UiModeManager) getSystemService(UI_MODE_SERVICE);

        uiModeManager.setNightMode(UiModeManager.MODE_NIGHT_NO);

    }
}