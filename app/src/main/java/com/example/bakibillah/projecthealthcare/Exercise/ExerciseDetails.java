package com.example.bakibillah.projecthealthcare.Exercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bakibillah.projecthealthcare.R;

/**
 * Created by BakiBillah on 8/22/2017.
 */

public class ExerciseDetails extends AppCompatActivity {


    ImageView imageView;
    TextView exerciseHeader;
    TextView exerciseDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_content_details);

        imageView = (ImageView)findViewById(R.id.allImageView);
        exerciseHeader = (TextView) findViewById(R.id.allHeader);
        exerciseDetails = (TextView) findViewById(R.id.allDetails);

        final Bundle bundle = getIntent().getExtras();

        if (bundle!=null){
            imageView.setImageResource(bundle.getInt("image"));
            exerciseHeader.setText(bundle.getString("name"));
            exerciseDetails.setText(bundle.getString("details"));
        }
    }
}
