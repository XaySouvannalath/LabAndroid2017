package com.skywalker.doflamingo.lab2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Lab5 extends AppCompatActivity {
private RadioGroup RadioSexGroup;
    private RadioButton RadioSexButton;
    private Button btnDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab5);
        addListenerOnButton();
    }
    public void addListenerOnButton(){
        RadioSexGroup=(RadioGroup)findViewById(R.id.radioSex);
        btnDisplay=(Button)findViewById(R.id.btnDisplay);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selected = RadioSexGroup.getCheckedRadioButtonId();
                RadioSexButton=(RadioButton)findViewById(selected);
                Toast.makeText(Lab5.this, RadioSexButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
