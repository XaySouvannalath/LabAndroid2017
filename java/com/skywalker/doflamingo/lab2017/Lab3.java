package com.skywalker.doflamingo.lab2017;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Lab3 extends AppCompatActivity {
Button btchangeimage;
    ImageView imageview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3);

addListenerOnButton();


    }
    public void addListenerOnButton(){
        btchangeimage=(Button)findViewById(R.id.btnchangeImage);
        imageview1=(ImageView)findViewById(R.id.imageView1);
        btchangeimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageview1.setImageResource(R.drawable.add);
            }
        });
    }
}
