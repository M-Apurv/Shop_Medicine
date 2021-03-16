package com.example.shopmedicine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AllergiesActivity extends AppCompatActivity
{
    public static final String ALLERGIE_MEDNO = "A_medNo";
    public static int val;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allergies);

        Toolbar toolbar=findViewById(R.id.top_toolbar);
        setSupportActionBar(toolbar);

        int A_medNo = (Integer)getIntent().getExtras().get(ALLERGIE_MEDNO);
        Allergies allergie = Allergies.allergies[A_medNo];

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(allergie.getName());

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(allergie.getDescription());

        TextView price=(TextView)findViewById(R.id.price);
        price.setText("The price is : Rs "+allergie.getPrice());

        val=Integer.parseInt(allergie.getPrice());

    }

    public void OrderMed(View view)
    {
        EditText messageView= (EditText) findViewById(R.id.Number);
        int messageText=Integer.parseInt(messageView.getText().toString());
        Intent intent =new Intent(this,Order.class);
        intent.putExtra(Order.EXTRA_MESSAGE, Integer.toString(messageText*val));

        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.top,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.app_det:
                Intent intent =new Intent(this,AppDetail.class);
                startActivity(intent);
                break;
            case R.id.detail:
                Intent intent_d =new Intent(this,Detail.class);
                startActivity(intent_d);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}