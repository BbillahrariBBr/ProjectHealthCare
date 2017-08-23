package com.example.bakibillah.projecthealthcare.PrimaryTreatment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bakibillah.projecthealthcare.R;

public class PrimaryTreatmentActivity extends AppCompatActivity {

    ImageView imageView;
    TextView headerPT;
    TextView definationPT;
    TextView causesPT;
    TextView symptomsPT;
    TextView toDoPT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary_treatment);

        imageView = (ImageView)findViewById(R.id.imageViewS);
        headerPT = (TextView) findViewById(R.id.header);
        definationPT = (TextView) findViewById(R.id.defination);
        causesPT = (TextView) findViewById(R.id.causesDetails);
        symptomsPT = (TextView) findViewById(R.id.symptomsDetails);
        toDoPT = (TextView) findViewById(R.id.toDoDetails);

        final Bundle bundle = getIntent().getExtras();

        if (bundle!=null){
            imageView.setImageResource(bundle.getInt("image"));
            headerPT.setText(bundle.getString("TreatmentName"));
            definationPT.setText(bundle.getString("TreatmentDefination"));
            causesPT.setText(bundle.getString("TreatmentCauses"));
            symptomsPT.setText(bundle.getString("TreatmentSymptoms"));
            toDoPT.setText(bundle.getString("TreatmentToDo"));
        }
    }
}
