package com.example.cmdf2020new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;

import android.graphics.Color;
import android.widget.Toast;

public class TaskCalendarActivity extends AppCompatActivity {

    CalendarView simpleCalendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taskcalendar);
        simpleCalendarView = findViewById(R.id.CalendarViewer);
        simpleCalendarView.setFocusedMonthDateColor(Color.RED);
        simpleCalendarView.setUnfocusedMonthDateColor(Color.BLUE);
        simpleCalendarView.setSelectedWeekBackgroundColor(Color.RED);
        simpleCalendarView.setWeekSeparatorLineColor(Color.GREEN);
    }

    public void goToPlant(View v){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}