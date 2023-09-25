package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText myTextField1;
    EditText myTextField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextField1 = (EditText) findViewById(R.id.myTextField1);
        myTextField = (EditText) findViewById(R.id.myTextField);
    }

    public void subtractionClick(View view) {
        String firstStr = myTextField1.getText().toString();
        String secondStr = myTextField.getText().toString();

        int result = Integer.parseInt(firstStr) - Integer.parseInt(secondStr);
        goToActivity(""+result);
    }

    public void additionClick(View view) {
        String firstStr = myTextField1.getText().toString();
        String secondStr = myTextField.getText().toString();

        int result = Integer.parseInt(firstStr) + Integer.parseInt(secondStr);
        goToActivity(""+result);
    }

    public void multiplicationClick(View view) {
        String firstStr = myTextField1.getText().toString();
        String secondStr = myTextField.getText().toString();

        int result = Integer.parseInt(firstStr) * Integer.parseInt(secondStr);
        goToActivity(""+result);
    }

    public void divisionClick(View view) {
        String firstStr = myTextField1.getText().toString();
        String secondStr = myTextField.getText().toString();
        String result;
        if(Integer.parseInt(secondStr) == 0) {
            result = "division by zero is undefined!";
        } else {
            int calc = Integer.parseInt(firstStr) / Integer.parseInt(secondStr);
            result = "" + calc;
        }
        goToActivity(result);
    }

    public void goToActivity(String s) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", s);
        startActivity(intent);
    }
}