package com.example.a816018640_816015043_a1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    public ShoppingCart cart=new ShoppingCart();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAddRog(View view){
        RadioGroup rogGroup= (RadioGroup) findViewById(R.id.RogGroup);
        int rID=rogGroup.getCheckedRadioButtonId();

        if(rID==-1){
            //nothing added;
        }else{
            RadioButton rogButton=findViewById(rID);
            String specs=rogButton.getText().toString();
            Product rog=new Product("ASUS ROG Strix G15 Gaming Laptop",specs);
            cart.addToCart(rog);
            Toast.makeText(getApplicationContext(), "Item Added", Toast.LENGTH_SHORT).show();
        }

    }


    public void onClickAddHp(View view){
        RadioGroup hp=(RadioGroup) findViewById(R.id.hpGroup);
        int hpID=hp.getCheckedRadioButtonId();

        if(hpID==-1){
            //nothing added
        }else{
            RadioButton hpbutton=findViewById(hpID);
            String specs=hpbutton.getText().toString();
            Product hpitem=new Product("HP Pavilion Gaming 15.6-Inch Micro-EDGE Laptop",specs);
            cart.addToCart(hpitem);
            Toast.makeText(getApplicationContext(), "Item Added", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickAddAcer(View view) {
        RadioGroup acer=(RadioGroup) findViewById(R.id.acerGroup);
        int acerID=acer.getCheckedRadioButtonId();

        if(acerID==-1){
            //nothing added
        }else{
            RadioButton acerbutton=findViewById(acerID);
            String specs=acerbutton.getText().toString();
            Product acerItem=new Product("Acer Nitro 5",specs);
            cart.addToCart(acerItem);
            Toast.makeText(getApplicationContext(), "Item Added", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickAddRazer(View view) {
        RadioGroup razer=(RadioGroup) findViewById(R.id.razerGroup);
        int razerId=razer.getCheckedRadioButtonId();

        if(razerId==-1){
            //nothing added
        }else{
            RadioButton razerbutton=findViewById(razerId);
            String specs=razerbutton.getText().toString();
            Product acerItem=new Product("Razer Blade 15",specs);
            cart.addToCart(acerItem);
            Toast.makeText(getApplicationContext(), "Item Added", Toast.LENGTH_SHORT).show();
        }
    }


    public void changeConstraint(View view) throws IOException {
        Intent intent = new Intent(this,CartActivity.class);
        intent.putExtra("cart",cart);
        startActivity(intent);
    }

}
