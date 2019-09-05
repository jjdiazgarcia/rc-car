package com.example.rccar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.EditText;

import com.handle.network.Network;

public class MainActivity extends AppCompatActivity {

    private static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Network wifiDevice = new Network(getApplicationContext());
        if (wifiDevice.getState() != WifiManager.WIFI_STATE_ENABLED) {
            wifiDevice.enableWifiPopUp(MainActivity.this).show();
        } else {
            Intent intent = new Intent(MainActivity.this, CarControl.class);
            intent.putExtra(EXTRA_MESSAGE, R.string.app_name);
            finish();
            startActivity(intent);
        }
    }

}
