package com.example.bakibillah.projecthealthcare;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class DiseaseDetectionActivity extends AppCompatActivity {

//    String[] textlayout1 ={"fever","sudden",
//            "100.4", "Loss, tiredness",
//            "increases"
//            ,"Bloating","Pain"};

    // String[] name ={"bangladesh","India","Srilanka"};

    String[] textlayout1 = {"fever(sometimes as high as 104 °F)", "sudden, high fever (up to 106 degrees Fahrenheit)",
            "Fever over 100.4 F", "Loss of appetite, tiredness and feeling sick",
            "Fever that starts low and increases daily, possibly reaching as high as 104.9 F "
            , "Bloating in your belly", "Pain on one side or both side on head"};

    String[] version = {"CupcCake", "Donut", "Eclair", "Froyo", "Gingerbread", "HoneyComb", "Ice Cream sandwitch",
            "JellyBean", "Kitkat", "Lollipop", "Marshmallow", "Nougat"};

    String[] symptomps1 = {"Headache", "confussion", "Gagging", "Loss of Vision", "cramps",
            "cought",};


    String[] textlayout2 = {"blurred vision", "Watery stools", "Diarrhea or constipation", "Spots (a rash)",
            "Sore throat", "severe headache", "joint pain"};
    //
//
    String[] textlayout3 = {"swelling around the joints", "swollen lymph glands",
            "Nasal congestion", "Muscle aches", "Abdominal pain", "nausea and vomiting"};


    TextInputLayout forsymp1Tlayout;
    TextInputLayout forsymp2Tlayout;
    TextInputLayout forsymp3Tlayout;

    AutoCompleteTextView forsymp1Auto;
    AutoCompleteTextView forsymp2Auto;
    AutoCompleteTextView forsymp3Auto;

    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_detection);

        //textinput

        forsymp1Tlayout = (TextInputLayout) findViewById(R.id.symp_1_tlayout);
        forsymp2Tlayout = (TextInputLayout) findViewById(R.id.symp_2_tlayout);
        forsymp3Tlayout = (TextInputLayout) findViewById(R.id.symp_3_tlayout);

        //auto complete text view

        forsymp1Auto = (AutoCompleteTextView) findViewById(R.id.symp_1_auto);
        forsymp2Auto = (AutoCompleteTextView) findViewById(R.id.symp_2_auto);
        forsymp3Auto = (AutoCompleteTextView) findViewById(R.id.symp_3_auto);

        submit = (Button) findViewById(R.id.submit_disease_button);

//        String  getrecAuto1;
//        String  getrecAuto2;
//        String  getrecAuto3;


//array adapter for auto1

        ArrayAdapter<String> adapterSymptom1 = new ArrayAdapter<String>(DiseaseDetectionActivity.this,
                android.R.layout.select_dialog_item, textlayout1);
        forsymp1Auto.setThreshold(1);
        forsymp1Auto.setAdapter(adapterSymptom1);
        forsymp1Auto.setTextColor(Color.BLUE);
//array adapter for auto2

        ArrayAdapter<String> adapterSymptom2 = new ArrayAdapter<String>(DiseaseDetectionActivity.this,
                android.R.layout.select_dialog_item, textlayout2);

        forsymp2Auto.setThreshold(1);
        forsymp2Auto.setAdapter(adapterSymptom2);
        forsymp2Auto.setTextColor(Color.GRAY);

//array adapter for auto3
        ArrayAdapter<String> adapterSymptom3 = new ArrayAdapter<String>(DiseaseDetectionActivity.this,
                android.R.layout.select_dialog_item, textlayout3);

        forsymp3Auto.setThreshold(1);
        forsymp3Auto.setAdapter(adapterSymptom3);
        forsymp3Auto.setTextColor(Color.GRAY);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int lenauto1 = forsymp1Auto.getText().toString().trim().length();
                int lenauto2 = forsymp2Auto.getText().toString().trim().length();
                int lenauto3 = forsymp3Auto.getText().toString().trim().length();

                if (lenauto1 == 0 || lenauto2 == 0 || lenauto3 == 0) {
                    if (lenauto1 == 0) {
                        forsymp1Tlayout.setError("This field needs to be filled");
                    }

                    if (lenauto2 == 0) {
                        forsymp2Tlayout.setError("This field needs to be filled");
                    }
                    if (lenauto3 == 0) {
                        forsymp3Tlayout.setError("This field needs to be filled");
                    }

                } else {
                    String autorec1 = forsymp1Auto.getText().toString();
                    String autorec2 = forsymp2Auto.getText().toString();
                    String autorec3 = forsymp3Auto.getText().toString();


                    Toast.makeText(DiseaseDetectionActivity.this, autorec1+" "+ autorec2+" "+autorec3, Toast.LENGTH_LONG).show();


                    forsymp1Tlayout.setError(null);
                    forsymp2Tlayout.setError(null);
                    forsymp3Tlayout.setError(null);
                    forsymp1Tlayout.clearFocus();


                }

            }
        });


    }




}

