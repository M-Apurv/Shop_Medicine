package com.example.shopmedicine;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HeadacheOrderActivity extends ListActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        ListView listHead = getListView();
        ArrayAdapter<Headache> listAdapter = new ArrayAdapter<Headache>(this, android.R.layout.simple_list_item_1, Headache.headaches);
        listHead.setAdapter(listAdapter);
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id)
    {
        Intent intent = new Intent(HeadacheOrderActivity.this, HeadacheActivity.class);
        intent.putExtra(HeadacheActivity.HEAD_MEDNO, (int) id);
        startActivity(intent);
    }
}
