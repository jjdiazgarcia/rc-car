package com.handle.network;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.wifi.WifiManager;

import com.example.rccar.R;

import androidx.appcompat.app.AlertDialog;

public class Network {

    private WifiManager wifiDevice;

    public Network(Context context) {
        wifiDevice =  (WifiManager)context.getSystemService(Context.WIFI_SERVICE);
    }

    public int getState() {
        return wifiDevice.getWifiState();
    }

    public AlertDialog enableWifiPopUp(final com.example.rccar.MainActivity activity) {
        AlertDialog.Builder wifiPopUp = new AlertDialog.Builder(activity);
        wifiPopUp.setTitle("Important!");
        wifiPopUp.setMessage(R.string.enable_wifi).setPositiveButton(R.string.configure_wifi_accept, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                activity.startActivity(new Intent(WifiManager.ACTION_PICK_WIFI_NETWORK));
            }
        }).setNegativeButton(R.string.configure_wifi_deny, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                activity.finish();
                System.exit(0);
            }
        });
        return wifiPopUp.create();
    }
}
