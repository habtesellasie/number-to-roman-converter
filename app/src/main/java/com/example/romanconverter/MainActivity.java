package com.example.romanconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b_convertToRoman, b_convertToNumber;
    EditText et_number, et_romanInput;
    TextView tv_romanOutput, tv_numberOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_convertToNumber = findViewById(R.id.b_convertToNumber);
        b_convertToRoman = findViewById(R.id.b_convertToRoman);
        et_number = findViewById(R.id.et_number);
        et_romanInput = findViewById(R.id.et_romanInput);
        tv_romanOutput = findViewById(R.id.tv_romanOutput);
        tv_numberOutput = findViewById(R.id.tv_numberOutput);

        b_convertToNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        b_convertToRoman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NumberConverter nc = new NumberConverter();
                int theNumber;
                String theRoman;
                theNumber = Integer.parseInt(et_number.getText().toString());
                theRoman = nc.toRoman(theNumber);
                tv_romanOutput.setText(theRoman);
            }
        });
    }
}