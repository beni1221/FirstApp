package com.example.arben.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button add = (Button)findViewById(R.id.addButton);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumberEditText = (EditText)findViewById(R.id.FirstNumberEditText);
                EditText secondNumberEditText = (EditText)findViewById(R.id.SecondNumberEditText);
                TextView ResultTextView = (TextView)findViewById(R.id.ResultTextView);
                int num1 = Integer.parseInt(firstNumberEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumberEditText.getText().toString());
                int sum = num1 + num2;
                ResultTextView.setText(sum + "");
            }
        });


    }
}
