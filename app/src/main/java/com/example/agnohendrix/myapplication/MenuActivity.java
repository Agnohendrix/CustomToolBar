package com.example.agnohendrix.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {


    public static String SELECTED;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        Intent messaggio = getIntent();
        String m = messaggio.getStringExtra(MainActivity.MESSAGE);
        Toast.makeText(this, m, Toast.LENGTH_LONG).show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

//Starts quiz activity with general questions
    public void SelGenerale(View view) {
        Intent intent2 = new Intent(this, QuizActivity.class);
        intent2.putExtra(SELECTED, "Generale");
        startActivity(intent2);
    }

//Starts quiz activity with history questions
    public void SelStoria(View view){
        Intent intent2 = new Intent(this, QuizActivity.class);
        intent2.putExtra(SELECTED, "Storia");
        startActivity(intent2);
    }
}
