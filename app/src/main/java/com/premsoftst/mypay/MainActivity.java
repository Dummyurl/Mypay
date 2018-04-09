package com.premsoftst.mypay;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView textTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "font/adi_bold.otf");

        final ViewFlipper MyViewFlipper = (ViewFlipper)findViewById(R.id.viewflipper);
        MyViewFlipper.startFlipping();
        MyViewFlipper.setFlipInterval(1500);
//        textTitle = findViewById(R.id.txt_title);
//        textTitle.setTypeface(custom_font);
      //  Toolbar toolbarTop = (Toolbar) findViewById(R.id.toolbar_top);
   //     TextView mTitle = (TextView) toolbarTop.findViewById(R.id.toolbar_title);
//        mTitle.setTypeface(custom_font);
    }
}
