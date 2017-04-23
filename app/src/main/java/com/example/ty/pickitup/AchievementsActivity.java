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
                                {"litter", "water_bottles", "plastic_bags"};

    private static final int[] LEVELS = {1, 10, 50};


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
        achievements.get(0).setImage(R.mipmap.ic_litter_green);
        achievements.get(1).setImage(R.mipmap.ic_litter_blue);
        achievements.get(2).setImage(R.mipmap.ic_litter_gold);
        achievements.get(3).setImage(R.mipmap.ic_bottle_green);
        achievements.get(4).setImage(R.mipmap.ic_bottle_blue_v2);
        achievements.get(5).setImage(R.mipmap.ic_bottle_gold);
        achievements.get(6).setImage(R.mipmap.ic_bag_green);
        achievements.get(7).setImage(R.mipmap.ic_bag_blue);
        achievements.get(8).setImage(R.mipmap.ic_bag_gold);


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

