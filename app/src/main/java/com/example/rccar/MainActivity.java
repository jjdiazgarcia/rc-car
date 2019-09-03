package com.example.rccar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import com.handle.network.Network;

public class MainActivity extends AppCompatActivity {

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

        }
    }

}
