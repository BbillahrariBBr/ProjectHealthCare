package com.example.bakibillah.projecthealthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bakibillah.projecthealthcare.PrimaryTreatment.PrimaryTreatmentListActivity;

//import com.example.bakibillah.projecthealthcare;

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

        btnDiseaseDitection = (Button)findViewById(R.id.food_btn);
        btnPregnancyCare = (Button)findViewById(R.id.advice_btn);
        btnEmergencyContact = (Button)findViewById(R.id.button_emergencycontacts);
        btnFoodPlan = (Button)findViewById(R.id.advice_btn);
        btnPrimaryTreatment = (Button)findViewById(R.id.exercise_btn);

       // new PreferenceManager(this).clearPreference();
//        finish();
    }

    public void OnButtonClickListenerMain(View view){

        if (view.getId()==R.id.food_btn){
            Intent disesIntent = new Intent(MainActivity.this,DiseaseDetectionActivity.class);
            startActivity(disesIntent);

        }
      if(view.getId()==R.id.exercise_btn){
          Intent pIntent = new Intent(MainActivity.this,PrimaryTreatmentListActivity.class);
          startActivity(pIntent);
      }
        if (view.getId()==R.id.labour_btn){
            Intent foodIntent = new Intent(MainActivity.this,FoodPlanActivity.class);
            startActivity(foodIntent);

        }
        if (view.getId()==R.id.advice_btn){
            Intent pregnancyIntent = new Intent(MainActivity.this,PregnancyCareActivity.class);
            startActivity(pregnancyIntent);

        }
        if (view.getId()==R.id.button_emergencycontacts){
            Intent econtactIntent = new Intent(MainActivity.this,EmergencyContactActivity.class);
            startActivity(econtactIntent);

        }
    }
}
