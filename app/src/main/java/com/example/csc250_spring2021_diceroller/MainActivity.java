package com.example.csc250_spring2021_diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button zeroButton;
    private Button oneButton;
    private Button twoButton;
    private Button threeButton;
    private Button fourButton;
    private Button fiveButton;
    private Button sixButton;
    private Button sevenButton;
    private Button eightButton;
    private Button nineButton;
    private TextView qtyTV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.oneButton = this.findViewById(R.id.OneB);
        this.qtyTV = this.findViewById(R.id.qtyTV);
    }

    public void qtyButtonPressed(View v)
    {
        if(v == this.oneButton)
        {
            this.qtyTV.setText("1");
        }
    }

}