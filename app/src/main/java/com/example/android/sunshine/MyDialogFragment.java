package com.example.android.sunshine;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.widget.Toast;

/**
 * Created by hp on 27-09-2017.
 */

public class MyDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        /*builder.setMessage("Are you sure u sucker?")
                .setTitle("Message Love")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // FIRE ZE MISSILES!
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                    }
                });*/
        // Use the Builder class for convenient dialog construction
        final String[] titles = getResources().getStringArray(R.array.pref_sync_frequency_titles);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Lists are here baby!");
        builder.setItems(R.array.pref_sync_frequency_titles, new DialogInterface.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            public void onClick(DialogInterface dialog, int which) {
             // FOR T
                  Context context = getContext();
                CharSequence text = "Hello toast! "+titles[which];
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                // The 'which' argument contains the index position
                // of the selected item
            }
        });
        // Create the AlertDialog object and return it
        return builder.create();
    }


}
