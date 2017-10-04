package com.example.android.sunshine;
import android.app.FragmentManager;
<<<<<<< HEAD
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
=======
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
>>>>>>> de8babfe8f7c39c4215388388979c8f3399c5f2f
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
<<<<<<< HEAD
import android.widget.ImageView;
import android.widget.LinearLayout;
=======
>>>>>>> de8babfe8f7c39c4215388388979c8f3399c5f2f
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
<<<<<<< HEAD

    //animation demo
        ImageView img = (ImageView)findViewById(R.id.ImageViewCap);
        ImageView thumb = (ImageView)findViewById(R.id.imageView2);

        img.animate().alpha(0f).setDuration(2000);
        thumb.animate().alpha(1f).setDuration(2000);




        Button enterBtn = (Button)findViewById(R.id.EnterButton);
        Button resetBtn = (Button)findViewById(R.id.resetBtn);
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
=======
        Button enterBtn = (Button)findViewById(R.id.EnterButton);
        Button resetBtn = (Button)findViewById(R.id.resetBtn);
        resetBtn.setOnClickListener(new View.OnClickListener() {
>>>>>>> de8babfe8f7c39c4215388388979c8f3399c5f2f
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
<<<<<<< HEAD



                String CHANNEL_ID = "my_channel_01";
                NotificationCompat.Builder mBuilder =
                        (NotificationCompat.Builder) new NotificationCompat.Builder(MainActivity.this)
                                .setSmallIcon(R.drawable.ic_notifications_black_24dp)
                                .setContentTitle("My notification")
                                .setContentText("Hello World!");

// Creates an explicit intent for an Activity in your app
                Intent resultIntent = new Intent(MainActivity.this, HelpActivity.class);

// The stack builder object will contain an artificial back stack for the
// started Activity.
// This ensures that navigating backward from the Activity leads out of
// your app to the Home screen.
                TaskStackBuilder stackBuilder = TaskStackBuilder.create(MainActivity.this);
// Adds the back stack for the Intent (but not the Intent itself)
                stackBuilder.addParentStack(HelpActivity.class);
// Adds the Intent that starts the Activity to the top of the stack
                stackBuilder.addNextIntent(resultIntent);
                PendingIntent resultPendingIntent =
                        stackBuilder.getPendingIntent(
                                0,
                                PendingIntent.FLAG_UPDATE_CURRENT
                        );
                mBuilder.setContentIntent(resultPendingIntent);
                NotificationManager mNotificationManager =
                        (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

// mNotificationId is a unique integer your app uses to identify the
// notification. For example, to cancel the notification, you can pass its ID
// number to NotificationManager.cancel().
                int mNotificationId=5;
                mNotificationManager.notify(mNotificationId, mBuilder.build());
=======
>>>>>>> de8babfe8f7c39c4215388388979c8f3399c5f2f
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

