package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import bsh.EvalError;
import bsh.Interpreter;

public class MainActivity extends AppCompatActivity {
    private Button button_one, button_two, button_three, button_four, button_five,
            button_six,button_seven,button_eight,button_nine, button_zero, button_plus,
            button_multiply, button_divide, button_mod, button_clear, button_clear_entry, button_equal,
            button_subtract;
    private ImageButton button_voice;
    private TextView operations_result;
    private String op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_one = findViewById(R.id.button_one);
        button_two = findViewById(R.id.button_two);
        button_three = findViewById(R.id.button_three);
        button_four = findViewById(R.id.button_four);
        button_five = findViewById(R.id.button_five);
        button_six = findViewById(R.id.button_six);
        button_seven = findViewById(R.id.button_seven);
        button_eight = findViewById(R.id.button_eight);
        button_nine = findViewById(R.id.button_nine);
        button_zero = findViewById(R.id.button_zero);
        button_plus = findViewById(R.id.button_plus);
        button_multiply = findViewById(R.id.button_multiply);
        button_divide = findViewById(R.id.button_divide);
        button_mod = findViewById(R.id.button_mod);
        button_clear = findViewById(R.id.button_clear);
        button_clear_entry = findViewById(R.id.button_clear_entry);
        button_equal = findViewById(R.id.button_equal);
        button_subtract = findViewById(R.id.button_subtract);
        button_voice = findViewById(R.id.button_voice);
        operations_result = findViewById(R.id.operations_result);

         op = "";


        button_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op += "1";
                operations_result .setText(op);

            }
        });

        button_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op += "2";
                operations_result .setText(op);

            }
        });

        button_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op += "3";
                operations_result .setText(op);

            }
        });

        button_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op += "4";
                operations_result .setText(op);

            }
        });

        button_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op += "5";
                operations_result .setText(op);

            }
        });

        button_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op += "6";
                operations_result .setText(op);

            }
        });

        button_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op += "7";
                operations_result .setText(op);

            }
        });

        button_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op += "8";
                operations_result .setText(op);

            }
        });

        button_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op += "9";
                operations_result .setText(op);

            }
        });

        button_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op += "0";
                operations_result .setText(op);

            }
        });

        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op += "+";
                operations_result .setText(op);

            }
        });

        button_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op += "-";
                operations_result .setText(op);

            }
        });

        button_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op += "*";
                operations_result .setText(op);

            }
        });

        button_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op += "/";
                operations_result .setText(op);

            }
        });

        button_mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op += "%";
                operations_result .setText(op);

            }
        });

        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = "";
                for(int x = 0;x<op.length()-1;x++){
                    temp += op.charAt(x);
                }
                op = temp;

            }
        });

        button_clear_entry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op = "";

            }
        });

        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = 0;
                Interpreter interpreter = new Interpreter();
                try {
                    res = (int) interpreter.eval(op);
                    System.out.println(res);
                } catch (EvalError evalError) {
                    evalError.printStackTrace();
                }
                
                operations_result.setText(String.valueOf(res));

            }
        });






    }
}