package com.example.bakibillah.projecthealthcare.Food;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.bakibillah.projecthealthcare.Adapter.CustomAdapter;
import com.example.bakibillah.projecthealthcare.R;
import com.example.bakibillah.projecthealthcare.RowItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BakiBillah on 8/22/2017.
 */

public class FoodDetails extends AppCompatActivity {

    ImageView imageView;
    TextView foodHeader;
    TextView foodDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_content_details);

        imageView = (ImageView)findViewById(R.id.allImageView);
        foodHeader = (TextView) findViewById(R.id.allHeader);
        foodDetails = (TextView) findViewById(R.id.allDetails);

        final Bundle bundle = getIntent().getExtras();

        if (bundle!=null){
            imageView.setImageResource(bundle.getInt("image"));
            foodHeader.setText(bundle.getString("name"));
            foodDetails.setText(bundle.getString("details"));
        }
    }

}

