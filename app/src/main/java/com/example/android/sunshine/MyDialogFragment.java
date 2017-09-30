package com.example.android.sunshine;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static android.R.id.list;

/**
 * Created by hp on 27-09-2017.
 */

public class MyDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final String[] titles = getResources().getStringArray(R.array.pref_sync_frequency_titles);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        /*
        //1. simple dailog with 2 buttons
        builder.setMessage("Are you sure u sucker?")
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
        //2. DIalog with list items (simple w/o radio or checkboxes)
       /* builder.setTitle("Lists are here baby!");
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

        */
       final ArrayList mSelectedItems = new ArrayList();  // Where we track the selected items
        /*
        //3. Dialog with multi choice options


        builder.setMultiChoiceItems(R.array.pref_sync_frequency_titles, null,
                new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which,
                                        boolean isChecked) {
                        if (isChecked) {
                            // If the user checked the item, add it to the selected items
                            mSelectedItems.add(titles[which]);
                        } else if (mSelectedItems.contains(which)) {
                            // Else, if the item is already in the array, remove it
                            mSelectedItems.remove(Integer.valueOf(which));
                        }
                    }
                })
                // Set the action buttons
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.M)
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // User clicked OK, so save the mSelectedItems results somewhere
                        // or return them to the component that opened the dialog
                        Log.d(Arrays.toString(mSelectedItems.toArray()),"array");
                        Toast.makeText(getContext(), "" + Arrays.toString(mSelectedItems.toArray()), Toast.LENGTH_SHORT).show();

                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });
                */
        builder.setSingleChoiceItems(R.array.pref_sync_frequency_titles, 0, new DialogInterface.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getContext(), "Hello Abhi, Its mpeg", Toast.LENGTH_LONG).show();
            }
        }).setPositiveButton("Yes", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        })
        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    }

                    ;
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }




}
