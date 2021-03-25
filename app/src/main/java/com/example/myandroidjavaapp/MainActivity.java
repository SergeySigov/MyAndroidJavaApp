package com.example.myandroidjavaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String operation = null;
    int firstNum = 0;
    int secondNum = 0;
    Integer lastResult = null;


    private void pressNumberKey(Integer keyValue){
        TextView outBox = findViewById(R.id.textView2);
        String str = "";
        if (operation == null) {
            firstNum = firstNum * 10 + keyValue;
            str = "" + firstNum;
        } else {
            secondNum = secondNum * 10 + keyValue;
            str = "" + firstNum + operation + secondNum;
        }
        outBox.setText(str);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btn0 = findViewById(R.id.btn0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pressNumberKey(0);
            }
        });

        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pressNumberKey(1);
            }
        });

        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pressNumberKey(2);
            }
        });

        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pressNumberKey(3);
            }
        });

        Button btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pressNumberKey(4);
            }
        });

        Button btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pressNumberKey(5);
            }
        });

        Button btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pressNumberKey(6);
            }
        });

        Button btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pressNumberKey(7);
            }
        });

        Button btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pressNumberKey(8);
            }
        });

        Button btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pressNumberKey(9);
            }
        });

        Button btnPlus = findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView outBox = findViewById(R.id.textView2);
                // Если уже вводится второе число
                if (operation != null && secondNum != 0) {
                    firstNum += secondNum;
                    secondNum = 0;
                } else if (operation == null && lastResult != null){
                    firstNum = lastResult;
                    lastResult = null;
                }
                operation = "+";
                String str = "" + firstNum + operation;
                outBox.setText(str);
            }
        });

        Button btnCalculate = findViewById(R.id.calculate);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView outBox = findViewById(R.id.textView2);
                if (operation != null) {
                    switch (operation){
                        case "+": lastResult = firstNum + secondNum;
                        break;

                        case "*": lastResult = firstNum * secondNum;
                        break;

                        case "-": lastResult = firstNum - secondNum;
                        break;

                        case "/": lastResult = firstNum / secondNum;
                        break;
                    }
                    firstNum = 0;
                    secondNum = 0;
                }
                operation = null;
                String str = "" + lastResult;
                outBox.setText(str);
            }
        });



    }
}