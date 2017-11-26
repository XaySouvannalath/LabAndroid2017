package com.skywalker.doflamingo.lab2017;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Lab6 extends AppCompatActivity {
RadioButton myOption1, myOption2, myOption3;
Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab6);
        init();
        myOption1=(RadioButton)findViewById(R.id.radio1);
        myOption2=(RadioButton)findViewById(R.id.radio2);
        myOption3=(RadioButton)findViewById(R.id.radio3);
        btn1= (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Lab6.this, "" +
                        "RadioButton 1: "+ myOption1.isChecked()+"\n" +
                        "RadioButton 2: "+ myOption2.isChecked()+"\n" +
                        "RadioButton 3: "+ myOption3.isChecked() +
                        "", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void init(){

    }
}
