package com.ermolnik.perfectandroid.ui;

import android.os.Bundle;

import com.ermolnik.perfectandroid.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.ermolnik.perfectandroid.App;
import com.ermolnik.perfectandroid.interactors.MainInteractor;

import javax.inject.Inject;


public class AppActivity extends AppCompatActivity {

    @Inject
    MainInteractor mainInteractor;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

      App.getApp().getAppComponent().inject(this);


    Toolbar toolbar = findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

      TextView textView = findViewById(R.id.text);

      textView.setText(mainInteractor.getMockedUser().toString());

    FloatingActionButton fab = findViewById(R.id.fab);
    fab.setOnClickListener(view -> Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
            .setAction("Action", null)
            .show());
  }

  @Override public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {
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
