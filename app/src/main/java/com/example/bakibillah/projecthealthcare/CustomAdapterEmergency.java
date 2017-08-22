package com.example.bakibillah.projecthealthcare;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by BakiBillah on 8/22/2017.
 */

public class CustomAdapterEmergency extends BaseAdapter {
    Context con;
    List<EmergencyRowItem> emergencyRowItems;

    public CustomAdapterEmergency(Context con, List<EmergencyRowItem> emergencyRowItems) {
        this.con = con;
        this.emergencyRowItems = emergencyRowItems;
    }

    @Override
    public int getCount() {
        return emergencyRowItems.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public class ViewHolder{
        TextView emergencyName;
        TextView emergencyPlace;
        TextView emergencyNumber;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder = null;
        LayoutInflater inflater = (LayoutInflater)con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (view==null)
        {
            view = inflater.inflate(R.layout.emergency_list_item,null);
            holder = new ViewHolder();

            holder.emergencyName = (TextView)view.findViewById(R.id.textViewName);
            holder.emergencyPlace = (TextView)view.findViewById(R.id.textViewPlace);
            holder.emergencyNumber = (TextView)view.findViewById(R.id.textViewPhone);

            EmergencyRowItem emergencyPosition = emergencyRowItems.get(i);

            holder.emergencyName.setText(emergencyPosition.getEmergencyName());
            holder.emergencyPlace.setText(emergencyPosition.getEmergencyPlace());
            holder.emergencyNumber.setText(emergencyPosition.getEmergencyPhNumber());

        }
        return view;
    }
}

