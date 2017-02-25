package com.solveet.ganesh.foodiesfeast;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class CartDisplayActivity extends AppCompatActivity {
    ListView listView;
    CartAdapter adapter ;
    TextView total ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_display);
        listView=(ListView)findViewById(R.id.cartList);
         adapter=new CartAdapter(getApplicationContext(),R.layout.each_cart);
        for(int i=1;i<5;i++){
            adapter.add(new CartItem("DIsh Name",987.654,"Describtion of item",4.55,3));
        }
        total=(TextView)findViewById(R.id.displayTotalCheckout);

    }
    public void checkOutButton(View view){
        int total1=0;
        for(int i=0;i<adapter.getCount();i++){
            total1+=((CartItem)adapter.getItem(i)).getQuantity()*((CartItem)adapter.getItem(i)).getPrice();
        }
        total.setText("TOTAL = USD"+total1);
        new AlertDialog.Builder(this).setTitle("Continue to pay").setMessage("By clicking continue you will directed to payments page to make a payment of USD "+total+"using any payment methods .")
          .setPositiveButton("Continue", new DialogInterface.OnClickListener() {
              @Override
              public void onClick(DialogInterface dialog, int which) {
                  Intent i=new Intent(getApplicationContext(),PaymentActivity.class);
                  startActivity(i);
              }
          }).setNegativeButton("Dont Continue", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).show() ;
    }
}
