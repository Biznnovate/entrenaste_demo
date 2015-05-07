package com.biznnovate.entrenaste_demo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


public class MainActivity extends ActionBarActivity  {
    public final static String EXTRA_MESSAGE = "com.biznnovate.entrenaste_demo.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

//create button option 1 with Cat 1
   public void buttonOnClick(View v) {
       Button button=(Button) v;
       startActivity(new Intent(getApplicationContext(), gyms_by_cat_crossfit.class));
       //((Button) v).setText("abdiel cueco");
   }

//Create button option 2 with Cat 2
    public void buttonOnClick2 (View v) {
        //do something in response to button
        Button button2=(Button) v;
        startActivity(new Intent(getApplicationContext(), functional_gym.class));

    }

//Create button for user image
    public void buttonOnClick3 (View v) {
        //do something in response to button
        ImageButton button3 = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), user_profile.class));

    }

    //Create button option 3 with Cat 3 Yoga
    public void buttonOnClick_yoga (View v) {
        //do something in response to button
        Button button3=(Button) v;
        startActivity(new Intent(getApplicationContext(), gyms_by_cat_yoga.class));

    }

//create button with on click not available message
    public void buttonOnClick_no_cat(View v) {
        Button button=(Button) v;
        ((Button) v).setText("No Disponible");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
