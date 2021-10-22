package com.example.a816018640_816015043_a1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart);
        TextView itemlist =(TextView) findViewById(R.id.Items);
        StringBuilder Items=new StringBuilder();
        ShoppingCart cart=(ShoppingCart) getIntent().getSerializableExtra("cart");
        for(Product p:cart.cart){
            Items.append(p.Item).append(" - ").append(p.specs).append("\n");
        }
            itemlist.setText(Items);
    }

    public void sendMessage(View view){
        String number="+18682922952";
        String message;
        StringBuilder Items=new StringBuilder();
        ShoppingCart cart=(ShoppingCart) getIntent().getSerializableExtra("cart");
        for(Product p:cart.cart){
            Items.append(p.Item).append(" - ").append(p.specs).append("\n");
        }
        message=Items.toString();
        SharedPreferences list=getSharedPreferences("MySharedPreference", Context.MODE_PRIVATE);
        SharedPreferences.Editor myEdit=list.edit();
        myEdit.putString("list",Items.toString());
        myEdit.apply();
        String url = "https://api.whatsapp.com/send?phone="+number+"&text="+message;
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void displayOrders(View view){
        Intent intent=new Intent(this,DisplayordersActivity.class);
        startActivity(intent);
    }
}