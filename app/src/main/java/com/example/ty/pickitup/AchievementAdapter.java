package com.example.ty.pickitup;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;


import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ameek_000 on 1/10/2017.
 */
public class AchievementAdapter extends ArrayAdapter<Achievement> {

    int cnt = 0;

    public AchievementAdapter(Context context, ArrayList<Achievement> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Achievement currentAchievement = getItem(position);

        View listItemView = convertView;
        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        TextView type = (TextView) listItemView.findViewById(R.id.achievement_type);
        TextView number = (TextView) listItemView.findViewById(R.id.achievement_number);
        ImageView image = (ImageView) listItemView.findViewById(R.id.achievement_icon);
        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.text_container);
        final ProgressBar progress = (ProgressBar) linearLayout.findViewById(R.id.progress);
        progress.setScaleY(3f);
        type.setText(currentAchievement.type());
        number.setText(Integer.toString(currentAchievement.level()));
        image.setImageResource(currentAchievement.image());
        image.setVisibility(View.VISIBLE);
        SharedPreferences preferences = getContext().getSharedPreferences("achievements", Context.MODE_PRIVATE);
        cnt = 0;
        switch (position) {
            case 0:
            case 1:
            case 2:
                cnt = preferences.getInt("litter", 0);
                //progress.setProgress(1);
                System.out.println("cnt: " + cnt);
                System.out.println("current achievel " + currentAchievement.level());
                progress.setProgress( (int) ((cnt /(double)currentAchievement.level()) * 100));
                break;
            case 3:
            case 4:
            case 5:
                cnt = preferences.getInt("bottle", 0);
                break;
            case 6:
            case 7:
            case 8:
                cnt = preferences.getInt("bag", 0);
                break;

        }

        return listItemView;
    }
}
