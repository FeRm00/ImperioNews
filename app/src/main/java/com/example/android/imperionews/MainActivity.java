package com.example.android.imperionews;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity {

    @Override

    //Font
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Set the font's path
        String fontPath = "fonts/OldeEnglish.ttf";
        // Get the customFont TextView
        TextView textView = (TextView) findViewById(R.id.txt_header);
        // Load the font as a TypeFace object
        Typeface typeFace = Typeface.createFromAsset(getAssets(), fontPath);
        // Set the extra fancy font in the TextView
        textView.setTypeface(typeFace);

    }




}
