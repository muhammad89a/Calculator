package com.example.mohammed.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText operand1;
    private EditText operand2;
    private Button btnAdd;
    private Button btnSub;
    private Button btnMul;
    private Button btnDiv;
    private Button CLR;
    private TextView txtResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operand1 = (EditText) findViewById(R.id.editOperand1);
        operand2 = (EditText) findViewById(R.id.editOperand2);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        CLR = (Button) findViewById(R.id.CLR);
        txtResult = (TextView) findViewById(R.id.txtResult);

        CLR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operand1.setText("");
                operand2.setText("");
                txtResult.setText("0.0");
                operand1.requestFocus();    
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((operand1.getText().toString().length() > 0) && (operand2.getText().toString().length() > 0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double result = oper1 + oper2;
                    txtResult.setText(Double.toString(result));
                } else {
                    Toast.makeText(MainActivity.this, "please enter in both fields", Toast.LENGTH_LONG).show();
                }
            }
        });


        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((operand1.getText().toString().length() > 0) && (operand2.getText().toString().length() > 0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double result = oper1 - oper2;
                    txtResult.setText(Double.toString(result));
                } else {
                    Toast.makeText(MainActivity.this, "please enter in both fields", Toast.LENGTH_LONG).show();
                }

            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((operand1.getText().toString().length() > 0) && (operand2.getText().toString().length() > 0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double result = oper1 * oper2;
                    txtResult.setText(Double.toString(result));
                } else {
                    Toast.makeText(MainActivity.this, "please enter in both fields", Toast.LENGTH_LONG).show();
                }

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((operand1.getText().toString().length() > 0) && (operand2.getText().toString().length() > 0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double result = oper1 / oper2;
                    txtResult.setText(Double.toString(result));
                } else {
                    Toast.makeText(MainActivity.this, "please enter in both fields", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
