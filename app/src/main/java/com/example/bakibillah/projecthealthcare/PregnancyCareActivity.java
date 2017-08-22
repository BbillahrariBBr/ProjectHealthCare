package com.example.bakibillah.projecthealthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bakibillah.projecthealthcare.Advice.AdviceListActivity;
import com.example.bakibillah.projecthealthcare.Exercise.ExerciseListActivity;
import com.example.bakibillah.projecthealthcare.Food.FoodListActivity;
import com.example.bakibillah.projecthealthcare.Labour.LabourListActivity;
import com.example.bakibillah.projecthealthcare.PrimaryTreatment.PrimaryTreatmentListActivity;

public class PregnancyCareActivity extends AppCompatActivity {

    //Button primaryTreatmentBtn;
    Button foodBtn;
    Button exerciseBtn;
    Button labourBtn;
    Button adviceBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregnancy_care);

        foodBtn = (Button)findViewById(R.id.food_btn);
        exerciseBtn = (Button)findViewById(R.id.exercise_btn);
        labourBtn = (Button)findViewById(R.id.labour_btn);
        adviceBtn = (Button)findViewById(R.id.advice_btn);


        //primaryTreatmentBtn.setOnClickListener(this);
//        foodBtn.setOnClickListener(this);
//        exerciseBtn.setOnClickListener(this);
//        labourBtn.setOnClickListener(this);
//        adviceBtn.setOnClickListener(this);
    }

    public void OnButtonClickListenerPregnancy(View view){

        if (view.getId()==R.id.food_btn){
            Intent disesIntent = new Intent(PregnancyCareActivity.this,FoodListActivity.class);
            startActivity(disesIntent);

        }
        if(view.getId()==R.id.exercise_btn){
            Intent pIntent = new Intent(PregnancyCareActivity.this,ExerciseListActivity.class);
            startActivity(pIntent);
        }
        if (view.getId()==R.id.labour_btn){
            Intent foodIntent = new Intent(PregnancyCareActivity.this,LabourListActivity.class);
            startActivity(foodIntent);

        }
        if (view.getId()==R.id.advice_btn){
            Intent pregnancyIntent = new Intent(PregnancyCareActivity.this,AdviceListActivity.class);
            startActivity(pregnancyIntent);

        }
//        if (view.getId()==R.id.button_emergencycontacts){
//            Intent econtactIntent = new Intent(PregnancyCareActivity.this,EmergencyContactActivity.class);
//            startActivity(econtactIntent);
//
//        }
    }

//    @Override
//    public void onClick(View view) {
//
//
//        if (view.getId()==R.id.food_btn)
//        {
//            Intent intent = new Intent(PregnancyCareActivity.this, FoodListActivity.class);
//            startActivity(intent);
//        }
//
//        else if (view.getId()==R.id.exercise_btn)
//        {
//            Intent intent = new Intent(PregnancyCareActivity.this, ExerciseListActivity.class);
//            startActivity(intent);
//        }
//
//        else if (view.getId()==R.id.labour_btn)
//        {
//            Intent intent = new Intent(PregnancyCareActivity.this, LabourListActivity.class);
//            startActivity(intent);
//        }
//
//        else if (view.getId()==R.id.advice_btn)
//        {
//            Intent intent = new Intent(PregnancyCareActivity.this, AdviceListActivity.class);
//            startActivity(intent);
//        }
//
//    }
}
