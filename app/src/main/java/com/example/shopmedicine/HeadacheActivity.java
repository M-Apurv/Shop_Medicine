package com.example.shopmedicine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class HeadacheActivity extends AppCompatActivity
{
    public static final String HEAD_MEDNO = "H_medNo";
    public static int val;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_headache);

        Toolbar toolbar=findViewById(R.id.top_toolbar);
        setSupportActionBar(toolbar);

        int H_medNo = (Integer)getIntent().getExtras().get(HEAD_MEDNO);
        Headache headache = Headache.headaches[H_medNo];

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(headache.getName());

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(headache.getDescription());

        TextView price=(TextView)findViewById(R.id.price);
        price.setText("The price is : Rs "+headache.getPrice());

        val=Integer.parseInt(headache.getPrice());

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