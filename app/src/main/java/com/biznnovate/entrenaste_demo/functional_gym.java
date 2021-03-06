package com.biznnovate.entrenaste_demo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class functional_gym extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_functional_gym);

        //strings for the listview Crossfit
        String[] functional = {"Functional 507", "3nergy Action", "Functional PTY", "Outdoor Functional"};
        ArrayAdapter<String> adapter_funcitonal = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, functional);
        ListView listView = (ListView)findViewById(R.id.list_functional);
        listView.setAdapter(adapter_funcitonal);
        //Create button with to go to gym

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View v, int position, long id) {
                if (position == 1) {
                    Intent myIntent = new Intent(getApplicationContext(), energy_action_demo.class);
                    startActivity(myIntent);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_functional_gym, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
