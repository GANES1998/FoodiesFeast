package com.solveet.ganesh.foodiesfeast;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ganesh on 24-02-2017.
 */

public class CartAdapter extends ArrayAdapter{
    ArrayList<CartItem> list=new ArrayList<>();
    public CartAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public void add(Object object) {
        list.add((CartItem)object);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return list.get(position);
    }
    static class DataHandle{
        TextView Name;
        TextView Price ;
        TextView Description ;
        TextView Quantity ;
        ImageButton removeButton ;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View cartView=convertView ;
        DataHandle Handler=new DataHandle();
        if(cartView==null){
            LayoutInflater layoutInflater=(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            cartView=layoutInflater.inflate(R.layout.each_cart,parent,false);
            Handler.Name=(TextView)cartView.findViewById(R.id.nameCart);
            Handler.Price=(TextView)cartView.findViewById(R.id.priceCart);
            Handler.Quantity=(TextView)cartView.findViewById(R.id.quantityCart);
            Handler.Description=(TextView)cartView.findViewById(R.id.descriptionCart);

            cartView.setTag(Handler);
        }
        else{
            Handler=(DataHandle) cartView.getTag();
        }
        CartItem c=(CartItem)getItem(position);
        Handler.Name.setText(c.getDishName());
        Handler.Price.setText(Double.toString(c.getPrice()));
        Handler.Quantity.setText(Integer.toString(c.getQuantity()));
        Handler.Description.setText(c.getDescription());
        Handler.removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return cartView ;
    }
}
