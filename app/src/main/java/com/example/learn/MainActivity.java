package com.example.learn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt=(TextView)findViewById(R.id.text);
        TextView txt2=(TextView)findViewById(R.id.text2);
        txt.setOnClickListener(new View.OnClickListener(){
                                    @Override
                                    public void onClick(View view)
                                    {
                                        Intent intent=new Intent(MainActivity.this,second.class);
                                        startActivity(intent);
                                    }
                                }
        );
        WorldClickListener clickListener=new WorldClickListener();
        txt2.setOnClickListener(clickListener);
    }

}

