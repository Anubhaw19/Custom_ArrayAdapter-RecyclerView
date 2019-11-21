package com.example.learn;

import android.view.View;
import android.widget.Toast;

class WorldClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(),"how are you?",Toast.LENGTH_LONG).show();
        }
    }

