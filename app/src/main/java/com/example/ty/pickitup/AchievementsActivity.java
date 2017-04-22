package com.example.ty.pickitup;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


import java.util.ArrayList;



public class AchievementsActivity extends AppCompatActivity {

    private static final String[] CATEGORIES =
                                {"litter", "water bottles", "plastic bags", "fast-food"};

    private static final int[] LEVELS = {1, 10 ,25, 50, 100, 500, 1000};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.achievement_list);

        ArrayList<Achievement> achievements = new ArrayList<Achievement>();
        for (int i = 0; i < CATEGORIES.length; i++) {
            for (int j = 0; j < LEVELS.length; j++) {
                achievements.add(new Achievement(CATEGORIES[i], LEVELS[j]));
            }
        }

        AchievementAdapter adapter = new AchievementAdapter(this, achievements);

        ListView listView = (ListView) findViewById(R.id.achievement_list);

        listView.setAdapter(adapter);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}

