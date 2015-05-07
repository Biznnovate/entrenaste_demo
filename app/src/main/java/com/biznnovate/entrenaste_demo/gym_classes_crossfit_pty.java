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


public class gym_classes_crossfit_pty extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym_classes_crossfit_pty);

        //strings for the listview Crossfit
        String[] crossfit_pty = {"6:00am - 6:45am Warm up", "7:00am - 7:45am Stretch",
                "6:00pm - 6:45pm Set Expert", "7:00pm - 7:45pm Stretch"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, crossfit_pty);
        final ListView listView = (ListView) findViewById(R.id.list_crossfit_pty_classes);
        listView.setAdapter(adapter);

        //Create button with to go to gym
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View v, int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(getApplicationContext(), gym_classes_crossfit_pty_class.class);
                    startActivity(myIntent);
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gym_classes_crossfit_pty, menu);
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
