package com.example.shopmedicine;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ColdsFluOrderActivity extends ListActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        ListView listCF = getListView();
        ArrayAdapter<ColdsFlu> listAdapter = new ArrayAdapter<ColdsFlu>(this, android.R.layout.simple_list_item_1, ColdsFlu.coldsFlus);
        listCF.setAdapter(listAdapter);
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id)
    {
        Intent intent = new Intent(ColdsFluOrderActivity.this, ColdsFluActivity.class);
        intent.putExtra(ColdsFluActivity.COLDFLU_MEDNO, (int) id);
        startActivity(intent);
    }
}
