package com.okolabo.android.sample02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Chapter07Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chapter07);
        setTitle(R.string.title_chapter07);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch(item.getItemId()) {
            case R.id.menu_chapter07:
                intent = new Intent(this, Chapter07Activity.class);
                startActivity(intent);
                break;
                
            case R.id.menu_chapter08:
                intent = new Intent(this, Chapter08Activity.class);
                startActivity(intent);
                break;
                
            case R.id.menu_chapter09:
                intent = new Intent(this, Chapter09Activity.class);
                startActivity(intent);
                break;
                
            case R.id.menu_chapter10:
                intent = new Intent(this, Chapter10Activity.class);
                startActivity(intent);
                break;
        }
        return true;
    }
}