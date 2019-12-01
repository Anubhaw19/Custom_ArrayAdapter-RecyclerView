package com.example.learn;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
       // LinearLayout linear=(LinearLayout)findViewById(R.id.list);
      @SuppressLint("WrongViewCast") ListView list=(ListView) findViewById(R.id.list); //we can declare this ListView in For loop also.,that will also work fine
        //creating a ArrayList
        ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("one","1",R.drawable.p1));
        words.add(new Word("two","2",R.drawable.p2));
        words.add(new Word("three","3",R.drawable.p3));
        words.add(new Word("four","4",R.drawable.p4));
        words.add(new Word("five","5",R.drawable.p5));
        words.add(new Word("six","6",R.drawable.p6));
        words.add(new Word("seven","7",R.drawable.p7));
        words.add(new Word("eight","8",R.drawable.p8));
        words.add(new Word("nine","9",R.drawable.p9));
        words.add(new Word("ten","10",R.drawable.p11));
        words.add(new Word("eleven","11",R.drawable.p11));
        words.add(new Word("twelve","12",R.drawable.p12));
        words.add(new Word("thirteen","13",R.drawable.p13));
        words.add(new Word("fourteen","14",R.drawable.p13));
        words.add(new Word("fifteen","15",R.drawable.p12));


        for(int index=0;index<words.size();index++)
        {
            /*we are creating list in linear layout using array list ,but that will occupy more memory in the device
            for that we can use ListView + Array Adapter, that will occupy less memory.,*/
            //this is creating  dynamic TextViews in the LinearLayout

//            TextView text=new TextView(this);
//            text.setText(word.get(index));
//            list.addView(text);

            //ArrayAdapter<Word> adapter=new ArrayAdapter<Word>(this,R.layout.list_item,words);

            //here [WordAdapter] class extends from [ArrayAdapter] class and overrided a function [getView],so that it can show more than one TextView ,or to create a complex LayOut
            WordAdapter adapter=new WordAdapter(this,words);//constructor of [WordAdapter] is taking only two attributes,i.e[context,Source]
            list.setAdapter(adapter);
        }
    }
}
