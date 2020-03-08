package com.example.cmdf2020new;

import  androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import model.plant.Plant;

public class PlantActivity extends AppCompatActivity {

    private ImageView image;   // the plant and its evolution

    Plant testPlant0 = new Plant(0, 1);
    Plant testPlant1 = new Plant(2, 1);
    Plant testPlant2 = new Plant(5, 4);
    Plant testPlant3 = new Plant(6, 1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant);
        updatePlantImage(testPlant2);
    }

    public void goMakeTask(View v) {
        Intent intent = new Intent(this, AddEditTaskActivity.class);
        startActivity(intent);
    }

    public void goToTasks(View v) {
        Intent intent = new Intent(this, TasksActivity.class);
        startActivity(intent);
    }

    public void goToCalendar(View v) {
        Intent intent = new Intent(this, TaskCalendarActivity.class);
        startActivity(intent);
    }

    public void goToSettings(View v) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    public void updatePlantImage(Plant p) {
        image = findViewById(R.id.plantImg);
        p.addEXP(TasksActivity.exp);
        int level = p.getCurrentLevel();
        if (level < 2) {
            image.setImageResource(R.drawable.plant_img0);
        } else if (level < 4) {
            image.setImageResource(R.drawable.plant_img1);
        } else if (level < 6) {
            image.setImageResource(R.drawable.plant_img2);
        } else {
            image.setImageResource(R.drawable.plant_img3);
        }
        TasksActivity.resetEXP();
    }
}
