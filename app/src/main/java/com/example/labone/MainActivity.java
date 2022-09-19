package com.example.labone;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText InputA;
    private EditText InputB;
    private Button btCal;
    private TextView MyResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InputA = (EditText) findViewById(R.id.editTexta);
        InputB = (EditText) findViewById(R.id.editTextb);

        MyResult = (TextView) findViewById(R.id.textViewResult);
        btCal = (Button) findViewById(R.id.buttonCal);
        btCal.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View view){
                int a = Integer.parseInt(InputA.getText().toString());
                int b = Integer.parseInt(InputB.getText().toString());
                int area = a * b ;
                int perimeter = (a + b) * 2 ;
                MyResult.setText("Area: " + area + "perimeter: " +perimeter);
            }
        });
    }
}