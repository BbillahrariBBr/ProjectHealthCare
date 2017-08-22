package com.example.bakibillah.projecthealthcare;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BakiBillah on 8/22/2017.
 */

public class HospitalEmergency extends AppCompatActivity {

    ListView hospitalListView;
    String[] hospitalName;
    String[] hospitalPlace;
    String[] hospitalNumber;

    List<EmergencyRowItem> hosRowItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_listview);

        hosRowItems = new ArrayList<EmergencyRowItem>();
        hospitalName = getResources().getStringArray(R.array.hospitalName);
        hospitalPlace = getResources().getStringArray(R.array.hospitalPlace);
        hospitalNumber = getResources().getStringArray(R.array.hospitalPhNumber);

        for (int i=0; i<hospitalName.length; i++){
            EmergencyRowItem item = new EmergencyRowItem(hospitalName[i],hospitalPlace[i],hospitalNumber[i]);
            hosRowItems.add(item);
        }

        hospitalListView = (ListView)findViewById(R.id.emergencyListView);

        CustomAdapterEmergency adapterEmergency = new CustomAdapterEmergency(this,hosRowItems);
        hospitalListView.setAdapter(adapterEmergency);

        hospitalListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Add Permission in Manifest
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +hospitalNumber[i]));
                startActivity(intent);
            }
        });

    }
}

