package com.solveet.ganesh.foodiesfeast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.ListOfRestaurent);
        RestaurentAdapter adapter=new RestaurentAdapter(getApplicationContext(),R.layout.each_restaurent );
        for(int i=0;i<5;i++){
            adapter.add(new Restaurent(23,"RestaurentName","Mon-Fri",0700,1900));
        }
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(getApplicationContext(),MenuDisplayActivity.class);
                startActivity(i);
            }
        });
    }


}
