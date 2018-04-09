package com.premsoftst.mypay;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;

/**
 * Created by Admin on 3/23/2018.
 */

public class Home_Fragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_main,container,false);
        final ViewFlipper MyViewFlipper = (ViewFlipper)v.findViewById(R.id.viewflipper);
        //Button button1 = (Button)findViewById(R.id.button1);
        //Button button2 = (Button)findViewById(R.id.button2);
        MyViewFlipper.startFlipping();
        MyViewFlipper.setFlipInterval(1500);

        return v;
    }
}
