package com.example.android.sunshine;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText editText;
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       if(item.getItemId()==R.id.openSettings)
       {
        //TODO say bye

           Intent intent = new Intent(MainActivity.this,MyPreferenceActivity.class);
           startActivity(intent);
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
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.context_menu, menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button enterBtn = (Button)findViewById(R.id.EnterButton);
        Button resetBtn = (Button)findViewById(R.id.resetBtn);
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("test","inside restBtn listner!!!");
               /* AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Are you sure you want to reset?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                editText = (EditText)findViewById(R.id.editText);
                                editText.setText("");
                            }
                        })
                        .setNegativeButton("Cancel", null);
                AlertDialog alert = builder.create();
                alert.show();*/
                FragmentManager manager = getFragmentManager();
               MyDialogFragment dialog = new MyDialogFragment();
                dialog.show(manager,"fragment_dialog");
            }
        });
       //register
        registerForContextMenu(enterBtn);
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        String value = preferences.getString("username","");

        //      textView4 = (TextView)findViewById(R.id.textView4);
        //        textView4.setText(value);


    }
}

