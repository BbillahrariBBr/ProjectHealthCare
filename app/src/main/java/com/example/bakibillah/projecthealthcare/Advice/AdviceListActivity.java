package com.example.bakibillah.projecthealthcare.Advice;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.bakibillah.projecthealthcare.Adapter.CustomAdapter;
import com.example.bakibillah.projecthealthcare.R;
import com.example.bakibillah.projecthealthcare.RowItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BakiBillah on 8/22/2017.
 */

public class AdviceListActivity extends AppCompatActivity {
    ListView listViewTV;
    TypedArray advPictures;
    String[] advNameTV;
    String[] advDetailsTV;

    List<RowItem> rowItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        rowItems = new ArrayList<>();
        advPictures = getResources().obtainTypedArray(R.array.advicePictures);
        advNameTV = getResources().getStringArray(R.array.adviceName);
        advDetailsTV= getResources().getStringArray(R.array.adviceDetails);

        listViewTV = (ListView)findViewById(R.id.fiveContent_listView);

        for (int i=0; i< advNameTV.length; i++)
        {
            RowItem item = new RowItem(advNameTV[i], advPictures.getResourceId(i, -1));
            rowItems.add(item);
        }
        CustomAdapter adapter = new CustomAdapter(AdviceListActivity.this, rowItems);
        listViewTV.setAdapter(adapter);

        listViewTV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(AdviceListActivity.this, AdviceDetails.class);


                intent.putExtra("image",advPictures.getResourceId(i, -1));
                intent.putExtra("name",advNameTV[i]);
                intent.putExtra("details",advDetailsTV[i]);
                startActivity(intent);
            }
        });
    }
}

