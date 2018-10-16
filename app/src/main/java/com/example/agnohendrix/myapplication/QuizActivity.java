package com.example.agnohendrix.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        Intent intent = getIntent();
        Toast.makeText(this,intent.getStringExtra(MenuActivity.SELECTED), Toast.LENGTH_LONG);

        TextView tv = findViewById(R.id.Question);
        tv.setText("Domanda di " + intent.getStringExtra(MenuActivity.SELECTED) + " ?");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public void clicked(View view) {
        PopupWindow popup = new PopupWindow();
        popup.showAsDropDown(view);
    }
}
