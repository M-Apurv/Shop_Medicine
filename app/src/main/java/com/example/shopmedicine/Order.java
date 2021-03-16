package com.example.shopmedicine;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Order extends AppCompatActivity
{
    public static final String EXTRA_MESSAGE="message";
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Intent intent=getIntent();
        String msg_text=intent.getStringExtra(EXTRA_MESSAGE);

        TextView msg_view=(TextView)findViewById(R.id.message);
        msg_view.setText("Your order of Rs."+msg_text+" will be delivered in five days");
    }
}