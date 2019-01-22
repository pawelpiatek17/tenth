package com.example.pawe.tenth;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String CUSTOM_ACTION = "com.example.pawe.tenth.CUSTOM_ACTION";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendBroadcast(View view) {
        Toast.makeText(this, "Send simple broadcast", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent();
        intent.setAction(CUSTOM_ACTION);
        sendBroadcast(intent);
    }

    public void sendOrderedBroadcast(View view) {
        Toast.makeText(this, "Send ordered broadcast", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent();
        intent.setAction(CUSTOM_ACTION);
        sendOrderedBroadcast(intent,null);
    }
}
