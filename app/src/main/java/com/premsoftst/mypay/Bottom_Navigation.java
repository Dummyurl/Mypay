package com.premsoftst.mypay;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;

/**
 * Created by Admin on 3/23/2018.
 */

public class Bottom_Navigation extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);
        Home_Fragment cameraImportFragment = new Home_Fragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameLayout,cameraImportFragment)
                .addToBackStack(null)
                .commit();
        SpaceNavigationView spaceNavigationView = (SpaceNavigationView) findViewById(R.id.space);
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState);
        spaceNavigationView.addSpaceItem(new SpaceItem("OFFERS", R.drawable.tag));
        spaceNavigationView.addSpaceItem(new SpaceItem("SEARCH", R.drawable.loupe));
        spaceNavigationView.addSpaceItem(new SpaceItem("PROFILE", R.drawable.profile));
        spaceNavigationView.addSpaceItem(new SpaceItem("SEARCH", R.drawable.settings));
        spaceNavigationView.showIconOnly();

        spaceNavigationView.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {
                Toast.makeText(Bottom_Navigation.this,"onCentreButtonClick", Toast.LENGTH_SHORT).show();
                Home_Fragment cameraImportFragment = new Home_Fragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frameLayout,cameraImportFragment)
                        .addToBackStack(null)
                        .commit();
            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                Toast.makeText(Bottom_Navigation.this, itemIndex + " haiii" + itemName, Toast.LENGTH_SHORT).show();
                Offer_Fragment cameraImportFragment = new Offer_Fragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frameLayout,cameraImportFragment)
                        .addToBackStack(null)
                        .commit();
            }
            

            @Override
            public void onItemReselected(int itemIndex, String itemName) {
                Toast.makeText(Bottom_Navigation.this, itemIndex + "byeee " + itemName, Toast.LENGTH_SHORT).show();
                Home_Fragment cameraImportFragment = new Home_Fragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frameLayout,cameraImportFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });


    }

//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        spaceNavigationView.onSaveInstanceState(outState);
//    }
}
