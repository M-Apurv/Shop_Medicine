package com.example.shopmedicine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Detail extends AppCompatActivity
{
    EditText name;
    EditText address;
    EditText phone;
    EditText email;
    TextView response;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        name=findViewById(R.id.name);
        address=findViewById(R.id.address);
        phone=findViewById(R.id.phone);
        email=findViewById(R.id.mail);
        button=findViewById(R.id.save);
        response=findViewById(R.id.response);
    }

    public void SaveD(View view)
    {
        name.setText("");
        address.setText("");
        phone.setText("");
        email.setText("");
        response.setText("Data Saved");
    }
}