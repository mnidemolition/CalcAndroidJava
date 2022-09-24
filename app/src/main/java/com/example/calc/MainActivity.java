package com.example.calc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(@NonNull Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.text);
    }
    public String onClickNum(View view){
        String text = editText.getText().toString();
        Button pressedButton = (Button)view;
        if(pressedButton.getText().toString().equals(",")){
            if(text.contains(",")){
                text = text.replace(",", "");
                System.out.println(text);
            }
        }
        String resultText = text+pressedButton.getText().toString();
        editText.setText(resultText);
        return resultText;
    }
    public void  onClickOperation(View view){
        String text = editText.getText().toString();
        Operations operations = new Operations();
        editText.setText(operations.mathOperation(view, text));
    }

    public void onClickEquals(View view){
        Calculation calc = new Calculation();
        editText.setText(calc.calculateOperation(editText.getText().toString()));
    }

    public void showExtend(View view){
        String text = editText.getText().toString();
        Operations operations = new Operations();
        editText.setText(operations.addExtendOperation(view, text));
    }
}
