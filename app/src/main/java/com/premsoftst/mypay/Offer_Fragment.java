package com.premsoftst.mypay;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;

/**
 * Created by Admin on 3/24/2018.
 */

public class Offer_Fragment extends Fragment{

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_offer,container,false);
        final ViewFlipper MyViewFlipper = (ViewFlipper)v.findViewById(R.id.viewflipper);
        MyViewFlipper.startFlipping();
        MyViewFlipper.setFlipInterval(1500);
        return v;
    }
}
