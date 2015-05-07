package com.biznnovate.entrenaste_demo;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class gyms_by_category extends ActionBarActivity {

    private static Context cat_context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gyms_by_category);
//to populate a listview
        populatelistview();
        registerClickCallback();

    }

    private void registerClickCallback() {
        //autogenerate
      ListView list = (ListView) findViewById(R.id.listView_cat);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

            public void onItemClick(AdapterView<?> paret, View viewClicked, int position, long id){
              TextView textView = (TextView) viewClicked;
                String cat_message = "You clicked # " + position
                        + ", Which is string: " + textView.getText().toString();
                Toast.makeText(gyms_by_category.cat_context, cat_message, Toast.LENGTH_LONG).show();
            }
        });
    }

    private void populatelistview() {
        //create a list
        String[] Gyms_by_Cat = {"Crossfit PTY", "Crossfit 123", "Functional Crossfit", "YogaFit"};
       // build the adapter
        ArrayAdapter<String> cat_adapter;
        cat_adapter = new ArrayAdapter<String>(cat_context, R.layout.cat_layout, Gyms_by_Cat);

        //configure the list view
     ListView list = (ListView) findViewById(R.id.listView_cat);
    list.setAdapter(cat_adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gyms_by_category, menu);
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
