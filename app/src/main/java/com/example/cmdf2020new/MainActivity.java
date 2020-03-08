package com.example.cmdf2020new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goViewTask(View v) {
        Intent intent = new Intent(this, TasksActivity.class);
        startActivity(intent);
    }
    public void goMakeTask(View v) {
        Intent intent = new Intent(this, AddEditTaskActivity.class);
        startActivity(intent);
    }

    public void goToCalendar(View v){
        Intent intent = new Intent (this, TaskCalendarActivity.class);
        startActivity(intent);
    }

    public void goToSettings(View v){
        Intent intent = new Intent (this, SettingsActivity.class);
        startActivity(intent);
    }


}
