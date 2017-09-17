package com.example.android.sunshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.TextureView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView greetingView;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       if(item.getItemId()==R.id.action_bye)
       {
        //TODO say bye
           greetingView.setText("I am going to change you");
           return true;
       }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        greetingView = (TextView)findViewById(R.id.greeting);
    }
}
