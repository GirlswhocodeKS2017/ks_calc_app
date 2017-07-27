package com.gwc.denise.mygwccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;





public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void add(View view){
        double answer = getFirstNum() + getSecondNum();
        display(answer);
    }

    public void minus(View view){
        double answer = getFirstNum() - getSecondNum();
        display(answer);
    }

    public void multiply(View view){
        double answer = getFirstNum() * getSecondNum();
        display(answer);
    }
    public void divide(View view){
        double answer = getFirstNum() / getSecondNum();
        display(answer);
    }


    private double getFirstNum(){
        EditText numTextField = (EditText) findViewById(R.id.num_input);
        return Double.parseDouble(numTextField.getText().toString());
    }

    private double getSecondNum(){
        EditText secnumTextField = (EditText) findViewById(R.id.num_input2);
        return Double.parseDouble(secnumTextField.getText().toString());
    }

    private void display(double number) {
        TextView resultTextView = (TextView) findViewById(R.id.answer_view);
        String stringAnswer = Double.toString(number);
        resultTextView.setText(stringAnswer);

    }


}


