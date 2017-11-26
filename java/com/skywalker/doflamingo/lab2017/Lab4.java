package com.skywalker.doflamingo.lab2017;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Lab4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab4);
        final AlertDialog.Builder adb = new AlertDialog.Builder(this);
        final Button btn1 = (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog ad = adb.create();
                ad.setMessage("Button 1 Event");
                ad.setTitle("Info.");
                ad.show();
            }
        });

    }
}
