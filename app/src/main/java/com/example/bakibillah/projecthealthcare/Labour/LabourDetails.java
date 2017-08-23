package com.example.bakibillah.projecthealthcare.Labour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bakibillah.projecthealthcare.R;

/**
 * Created by BakiBillah on 8/22/2017.
 */

public class LabourDetails extends AppCompatActivity {

    ImageView imageView;
    TextView labourHeader;
    TextView labourDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_content_details);

        imageView = (ImageView)findViewById(R.id.allImageView);
        labourHeader = (TextView) findViewById(R.id.allHeader);
        labourDetails = (TextView) findViewById(R.id.allDetails);

        final Bundle bundle = getIntent().getExtras();

        if (bundle!=null){
            imageView.setImageResource(bundle.getInt("image"));
            labourHeader.setText(bundle.getString("name"));
            labourDetails.setText(bundle.getString("details"));
        }
    }
}
