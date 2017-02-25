package com.solveet.ganesh.foodiesfeast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class MenuDisplayActivity extends AppCompatActivity {
    ListView listView ;
    DishAdapter adapter ;
    TextView textView;
    double price=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_display);
        listView=(ListView)findViewById(R.id.listOfDishes);
        adapter=new DishAdapter(getApplicationContext(),R.layout.each_menu);
        textView=(TextView) findViewById(R.id.total);
        for(int i=0;i<8;i++){
            adapter.add(new Dish("Dish Name",45.8765,"Good food to try ur best",7));
        }
        listView.setDividerHeight(0);
        listView.setAdapter(adapter);
    }
    public void buybutton(View view){
        for(int i=0;i<adapter.getCount();i++) {
            if (adapter.getIsChecked(i)) {
                price += adapter.getItem(i).getPrice();
            }
        }
        textView.setText(Double.toString(price));
        //Thread.sleep(2000);
        startActivity(new Intent(getApplicationContext(),PaymentActivity.class));
    }
}
