package com.example.shopmedicine;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StomachacheOrderActivity extends ListActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        ListView listS = getListView();
        ArrayAdapter<Stomachache> listAdapter = new ArrayAdapter<Stomachache>(this, android.R.layout.simple_list_item_1, Stomachache.stomachaches);
        listS.setAdapter(listAdapter);
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id)
    {
        Intent intent = new Intent(StomachacheOrderActivity.this, StomachacheActivity.class);
        intent.putExtra(StomachacheActivity.STO_MEDNO, (int) id);
        startActivity(intent);
    }
}
