package com.example.pawe.tenth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;


public class MyReceiver extends BroadcastReceiver {

    public static final String EXTRA = "com.example.pawe.tenth.EXTRA";
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle result = getResultExtras(true);
        String string = result.getString(EXTRA);
        if (string != null){
            Toast.makeText(context, "feedback: " + string, Toast.LENGTH_SHORT).show();
        }
    }
}
