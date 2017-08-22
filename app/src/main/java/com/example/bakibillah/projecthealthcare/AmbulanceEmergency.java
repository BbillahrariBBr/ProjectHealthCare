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

public class AmbulanceEmergency extends AppCompatActivity {

    ListView ambulanceListView;
    String[] ambulanceName;
    String[] ambulancePlace;
    String[] ambulanceNumber;

    List<EmergencyRowItem> ambuRowItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_listview);


        ambuRowItems = new ArrayList<EmergencyRowItem>();
        ambulanceName = getResources().getStringArray(R.array.ambulanceName);
        ambulancePlace = getResources().getStringArray(R.array.ambulancePlace);
        ambulanceNumber = getResources().getStringArray(R.array.ambulancePhNumber);

        for (int i=0; i<ambulanceName.length; i++)
        {
            EmergencyRowItem item = new EmergencyRowItem(ambulanceName[i],ambulancePlace[i],ambulanceNumber[i]);
            ambuRowItems.add(item);
        }

        ambulanceListView = (ListView)findViewById(R.id.emergencyListView);
        CustomAdapterEmergency ambulanceAdapter = new CustomAdapterEmergency(this,ambuRowItems);
        ambulanceListView.setAdapter(ambulanceAdapter);

        ambulanceListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ambulanceNumber[i]));
                startActivity(intent);
            }
        });

    }
}
