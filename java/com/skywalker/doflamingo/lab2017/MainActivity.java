package com.skywalker.doflamingo.lab2017;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button lab1, lab3, lab4, lab5, lab6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    public void init(){
        lab1=(Button)findViewById(R.id.lab1);
        lab3=(Button)findViewById(R.id.lab3);
        lab4=(Button)findViewById(R.id.lab4);
        lab5=(Button)findViewById(R.id.lab5);
        lab6=(Button)findViewById(R.id.lab6);
    }
    public void gotolab1(View v){
        Intent i = new Intent(this, Lab1.class);
        startActivity(i);
    }
    public void gotolab3(View v){
        Intent i3 = new Intent(this, Lab3.class);
        startActivity(i3);
    }
    public void gotolab4(View v){
        Intent i4 = new Intent(this, Lab4.class);
        startActivity(i4);
    }
    public void gotolab5(View v){
        Intent i5 = new Intent(this, Lab5.class);
        startActivity(i5);
    }
    public void gotolab6(View v){
        Intent i6 = new Intent(this, Lab6.class);
        startActivity(i6);
    }
}
