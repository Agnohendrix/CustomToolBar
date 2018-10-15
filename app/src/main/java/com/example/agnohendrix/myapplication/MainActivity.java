package com.example.agnohendrix.myapplication;


import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

    }

    public static final String MESSAGE = "Prova";

    public void nascondi(View view) {
        ActionBar ab = getSupportActionBar();
        ab.hide();
        Intent intent = new Intent(this, MenuActivity.class);
        intent.putExtra(MESSAGE, "Prova");
        startActivity(intent);
    }


}
