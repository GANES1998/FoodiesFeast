package com.solveet.ganesh.foodiesfeast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {
    ListView listView;
    private FirebaseAuth mAuth;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // action with ID action_refresh was selected
            case R.id.action_sign_out:
                mAuth.signOut();
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                Toast.makeText(getApplicationContext(),"Signed out",Toast.LENGTH_LONG).show();
                finish();
                break;
            default:
                break;
        }

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();

//        listView=(ListView)findViewById(R.id.ListOfRestaurent);
//        RestaurentAdapter adapter=new RestaurentAdapter(getApplicationContext(),R.layout.each_restaurent );
//        for(int i=0;i<5;i++){
//            adapter.add(new Restaurent(23,"RestaurentName","Mon-Fri",0700,1900));
//        }
//        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent i=new Intent(getApplicationContext(),MenuDisplayActivity.class);
//                startActivity(i);
//            }
//        });
    }
}
