package com.example.bakibillah.projecthealthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    // add Button
    private Button btnDiseaseDitection;
    private Button btnEmergencyContact;
    private Button btnFoodPlan;
    private Button btnPregnancyCare;
    private Button btnPrimaryTreatment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDiseaseDitection = (Button)findViewById(R.id.button_diease);
        btnEmergencyContact = (Button)findViewById(R.id.button_emergencycontacts);
        btnFoodPlan = (Button)findViewById(R.id.button_pregnancycare);
        btnPrimaryTreatment = (Button)findViewById(R.id.button_primarytreatment);

       // new PreferenceManager(this).clearPreference();
//        finish();
    }

    public void OnButtonClickListenerMain(View view){

        if (view.getId()==R.id.button_diease){
            Intent disesIntent = new Intent(MainActivity.this,DiseaseDetectionActivity.class);
            startActivity(disesIntent);

        }
        if (view.getId()==R.id.button_primarytreatment){
            Intent ptreatIntent = new Intent(MainActivity.this,PrimaryTreatmentActivity.class);
            startActivity(ptreatIntent);

        }
        if (view.getId()==R.id.button_foodanddiet){
            Intent foodIntent = new Intent(MainActivity.this,FoodPlanActivity.class);
            startActivity(foodIntent);

        }
        if (view.getId()==R.id.button_pregnancycare){
            Intent pregnancyIntent = new Intent(MainActivity.this,PregnancyCareActivity.class);
            startActivity(pregnancyIntent);

        }
        if (view.getId()==R.id.button_emergencycontacts){
            Intent econtactIntent = new Intent(MainActivity.this,EmergencyContactActivity.class);
            startActivity(econtactIntent);

        }
    }
}
