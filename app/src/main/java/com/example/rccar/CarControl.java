package com.example.rccar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class CarControl extends AppCompatActivity {

    private ImageButton forwardButton, backwardButton, leftButton, rightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_control);

        forwardButton =(ImageButton)findViewById(R.id.forward_button);
        forwardButton.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                Toast.makeText(getApplicationContext(), "Forward button", Toast.LENGTH_LONG).show();
            }
        });

        backwardButton =(ImageButton)findViewById(R.id.backward_button);
        backwardButton.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                Toast.makeText(getApplicationContext(), "Backward button", Toast.LENGTH_LONG).show();
            }
        });

        leftButton =(ImageButton)findViewById(R.id.left_button);
        leftButton.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                Toast.makeText(getApplicationContext(), "Left button", Toast.LENGTH_LONG).show();
            }
        });

        rightButton =(ImageButton)findViewById(R.id.right_button);
        rightButton.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                Toast.makeText(getApplicationContext(), "Right button", Toast.LENGTH_LONG).show();
            }
        });
    }
}
