package com.example.yazmeh.myfirstapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void convert(View v)
    {
        EditText inp = (EditText)findViewById(R.id.inp);
        TextView opt = (TextView)findViewById(R.id.op);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),"fonts/braille.ttf");
        opt.setTypeface(custom_font);

        String o="",i = (inp.getText()).toString();
        for(int j=0;j<i.length();j++)
        {
            int x=i.charAt(j);

            o=o+x+" ";
        }
        //o=o + " \u00F6";

        opt.setText(i);

    }
}
