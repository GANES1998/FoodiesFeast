package com.solveet.ganesh.foodiesfeast;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.test.suitebuilder.TestMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ganesh on 24-02-2017.
 */

public class RestaurentAdapter extends ArrayAdapter<Restaurent> {
    ArrayList<Restaurent> list=new ArrayList<Restaurent>();
    public RestaurentAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public void add(Restaurent object) {
        list.add(object);
    }
    static class DataHandle{
        TextView name;
        TextView noOfDish;
        TextView WorkingHors;
        TextView WorkingDays;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Nullable
    @Override
    public Restaurent getItem(int position) {
        return list.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        DataHandle Handler=new DataHandle();
        View RestaurentView=convertView;
        if(convertView==null){
            LayoutInflater layoutInflater=(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            RestaurentView=layoutInflater.inflate(R.layout.each_restaurent,parent,false);
            Handler.name=(TextView)RestaurentView.findViewById(R.id.resname);
            Handler.noOfDish=(TextView)RestaurentView.findViewById(R.id.noofdishes);
            Handler.WorkingDays=(TextView)RestaurentView.findViewById(R.id.workingDays);
            Handler.WorkingHors=(TextView)RestaurentView.findViewById(R.id.workingHours);
            RestaurentView.setTag(Handler);
        }
        else{
            Handler=(DataHandle)RestaurentView.getTag();
        }
        Restaurent r=(Restaurent)getItem(position);
        Handler.name.setText(r.getName());
        Handler.noOfDish.setText(r.getNumberOfitem());
        Handler.WorkingHors.setText(r.getStartWorkingTime());
        Handler.WorkingDays.setText(r.getWorkingDays());
        return RestaurentView;
    }
}
