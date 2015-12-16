package com.ainosoft.com.androiddemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

/**
 * @author mahesh@ainosoft.com
 * Starting point of an application
 * This will be first activity called when the application starts
 */
public class MainActivity extends AppCompatActivity {

    /*
        overrrided method of Activity
        will be called every time an activity loads in
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
        overrided method where we could define any specific option
        for this activity
     */
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

    /** Called when the user clicks on Trupublic label */
    public void startApp(View view) {
        // Do something in response to trupublic link
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
}
