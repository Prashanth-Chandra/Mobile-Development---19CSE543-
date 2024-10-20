package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView resultText, previousText;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btnAdd, btnSub, btnMul, btnDiv, btnEqual, btnClear;
    float value1, value2;
    boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultText = findViewById(R.id.resultText);
        previousText = findViewById(R.id.previousText);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnEqual = findViewById(R.id.btnEqual);
        btnClear = findViewById(R.id.btnClear);

        btn0.setOnClickListener(v -> resultText.append("0"));
        btn1.setOnClickListener(v -> resultText.append("1"));
        btn2.setOnClickListener(v -> resultText.append("2"));
        btn3.setOnClickListener(v -> resultText.append("3"));
        btn4.setOnClickListener(v -> resultText.append("4"));
        btn5.setOnClickListener(v -> resultText.append("5"));
        btn6.setOnClickListener(v -> resultText.append("6"));
        btn7.setOnClickListener(v -> resultText.append("7"));
        btn8.setOnClickListener(v -> resultText.append("8"));
        btn9.setOnClickListener(v -> resultText.append("9"));

        btnAdd.setOnClickListener(v -> {
            if (resultText.getText().length() != 0) {
                value1 = Float.parseFloat(resultText.getText().toString());
                add = true;
                previousText.setText(String.valueOf(value1) + " +");
                resultText.setText(null);
            }
        });

        btnSub.setOnClickListener(v -> {
            if (resultText.getText().length() != 0) {
                value1 = Float.parseFloat(resultText.getText().toString());
                sub = true;
                previousText.setText(String.valueOf(value1) + " -");
                resultText.setText(null);
            }
        });

        btnMul.setOnClickListener(v -> {
            if (resultText.getText().length() != 0) {
                value1 = Float.parseFloat(resultText.getText().toString());
                mul = true;
                previousText.setText(String.valueOf(value1) + " *");
                resultText.setText(null);
            }
        });

        btnDiv.setOnClickListener(v -> {
            if (resultText.getText().length() != 0) {
                value1 = Float.parseFloat(resultText.getText().toString());
                div = true;
                previousText.setText(String.valueOf(value1) + " /");
                resultText.setText(null);
            }
        });

        btnEqual.setOnClickListener(v -> {
            if (resultText.getText().length() != 0) {
                value2 = Float.parseFloat(resultText.getText().toString());

                if (add) {
                    resultText.setText(String.valueOf(value1 + value2));
                    add = false;
                }

                if (sub) {
                    resultText.setText(String.valueOf(value1 - value2));
                    sub = false;
                }

                if (mul) {
                    resultText.setText(String.valueOf(value1 * value2));
                    mul = false;
                }

                if (div) {
                    if (value2 == 0) {
                        Toast.makeText(MainActivity.this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                        resultText.setText("");
                    } else {
                        resultText.setText(String.valueOf(value1 / value2));
                    }
                    div = false;
                }
                previousText.setText("");
            }
        });

        btnClear.setOnClickListener(v -> {
            resultText.setText("");
            previousText.setText("");
        });
    }
}
