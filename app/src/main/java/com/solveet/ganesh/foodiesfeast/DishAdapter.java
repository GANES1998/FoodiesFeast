package com.solveet.ganesh.foodiesfeast;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ganesh on 24-02-2017.
 */

public class DishAdapter extends ArrayAdapter<Dish>{
    ArrayList<Dish> list=new ArrayList<Dish>();
    ArrayList<Boolean> isChecked=new ArrayList<Boolean>();
    public DishAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public void add(Dish object) {
        list.add(object);
        isChecked.add(false);
    }

    @Nullable
    @Override
    public Dish getItem(int position) {
        return list.get(position);
    }
    public boolean getIsChecked(int position){
        return isChecked.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
    static class DataHandle{
        TextView name ;
        TextView Price ;
        TextView Description ;
        Spinner spinner ;
        CheckBox checkBox ;
    }
    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View menuView=convertView;
        DataHandle Handler=new DataHandle();
        if(convertView==null){
            LayoutInflater layoutInflater=(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            menuView=layoutInflater.inflate(R.layout.each_menu,parent,false);
            Handler.name=(TextView)menuView.findViewById(R.id.name);
            Handler.Price=(TextView)menuView.findViewById(R.id.price);
            Handler.Description=(TextView)menuView.findViewById(R.id.description);
            Handler.checkBox=(CheckBox)menuView.findViewById(R.id.addToChartBox);
            Handler.spinner=(Spinner)menuView.findViewById(R.id.quantitySpinner);
            menuView.setTag(Handler);
        }
        else{
            Handler=(DataHandle) menuView.getTag();
        }
        Handler.checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  isChecked.set(position,true);
            }
        });
        Dish d=(Dish)getItem(position);
        Handler.name.setText(d.getDishName());
        Handler.Price.setText(Double.toString(d.getPrice()));
        Handler.Description.setText(d.description);
        Handler.checkBox.setChecked(isChecked.get(position));
        return menuView ;
    }
}
