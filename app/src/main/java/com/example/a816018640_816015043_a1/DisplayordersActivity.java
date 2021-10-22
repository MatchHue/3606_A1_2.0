package com.example.a816018640_816015043_a1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayordersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displayorders);
        TextView orders=(TextView) findViewById(R.id.orders);
        SharedPreferences items=this.getSharedPreferences("MySharedPreference", Context.MODE_PRIVATE);
        String list=items.getString("list","defaultValue");
        orders.setText(list);
    }
}