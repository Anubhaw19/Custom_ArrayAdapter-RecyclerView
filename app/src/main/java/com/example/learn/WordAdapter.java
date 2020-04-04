package com.example.learn;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words)
    {
        super(context,0,words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View ListItemView= convertView;
        if(ListItemView==null)
        {
            // Check if the existing view is being reused, otherwise inflate the view
            ListItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        // Get the {@link Word} object located at this position in the list.
        final Word CurrentWord=getItem(position);
        // Find the TextView in the list_item.xml layout with the ID txt1.
        final TextView defaultText=(TextView)ListItemView.findViewById(R.id.txt1);
        // Get the  defaultLanguagae from the current Word object and
        // set this text on the defaultText TextView
        defaultText.setText(CurrentWord.getDefaultTranslation());
        // Find the TextView in the list_item.xml layout with the ID txt2.
        TextView miwokText=(TextView)ListItemView.findViewById(R.id.txt2);
        // Get the  miwokLanguagae from the current Word object and
        // set this text on the defaultText TextView
        miwokText.setText(CurrentWord.getMiwokTranslation());

        ImageView imageView=(ImageView)ListItemView.findViewById(R.id.img);
        imageView.setImageResource(CurrentWord.getImageResourceId());
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),CurrentWord.getDefaultTranslation()+" clicked",Toast.LENGTH_SHORT).show();
            }
        });



        return ListItemView;
    }
}
