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
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=findViewById(R.id.top_toolbar);
        setSupportActionBar(toolbar);

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                if(position==0)
                {
                    Intent intent=new Intent(MainActivity.this,AllergiesOrderActivity.class);
                    startActivity(intent);
                }
                if(position==1)
                {
                    Intent intent=new Intent(MainActivity.this,ColdsFluOrderActivity.class);
                    startActivity(intent);
                }
                if(position==2)
                {
                    Intent intent=new Intent(MainActivity.this,HeadacheOrderActivity.class);
                    startActivity(intent);
                }
                if(position==3)
                {
                    Intent intent=new Intent(MainActivity.this,StomachacheOrderActivity.class);
                    startActivity(intent);
                }
            }
        };
        ListView listView=(ListView)findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
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




