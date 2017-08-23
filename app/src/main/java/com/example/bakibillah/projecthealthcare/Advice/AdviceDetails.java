package com.example.bakibillah.projecthealthcare.Advice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bakibillah.projecthealthcare.R;

/**
 * Created by BakiBillah on 8/22/2017.
 */

public class AdviceDetails extends AppCompatActivity {

    ImageView imageView;
    TextView adviceHeader;
    TextView adviceDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_content_details);

        imageView = (ImageView)findViewById(R.id.allImageView);
        adviceHeader = (TextView) findViewById(R.id.allHeader);
        adviceDetails = (TextView) findViewById(R.id.allDetails);

        final Bundle bundle = getIntent().getExtras();

        if (bundle!=null){
            imageView.setImageResource(bundle.getInt("image"));
            adviceHeader.setText(bundle.getString("name"));
            adviceDetails.setText(bundle.getString("details"));
        }
    }
}

