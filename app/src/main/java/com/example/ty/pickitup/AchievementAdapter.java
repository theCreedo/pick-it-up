package com.example.ty.pickitup;

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


    public AchievementAdapter(Context context, ArrayList<Achievement> list){
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Achievement currentAchievement = getItem(position);

        View listItemView = convertView;
        if(listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        TextView type = (TextView) listItemView.findViewById(R.id.achievement_type);
        TextView number = (TextView) listItemView.findViewById(R.id.achievement_number);
        ImageView image = (ImageView) listItemView.findViewById(R.id.achievement_icon);
        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.text_container);
        type.setText(currentAchievement.type());
        number.setText(currentAchievement.level());
        image.setImageResource(currentAchievement.image());
        image.setVisibility(View.VISIBLE);


        return listItemView;
    }
}
