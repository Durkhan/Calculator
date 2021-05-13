package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    TextView one;
    boolean isNewOp=true;
    String oldnumber="",op="+";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=findViewById(R.id.result);
        one=findViewById(R.id.one);

    }


    public void eventNumber(View view) {
        if(isNewOp){
            result.setText("");
        }
        isNewOp=false;
        String numbers=result.getText().toString();
        switch (view.getId()){
            case R.id.one:
                numbers=numbers+"1";

                break;
            case R.id.two:
                numbers=numbers+"2";
                break;

            case R.id.three:
                numbers=numbers+"3";
                break;
            case R.id.four:
                numbers=numbers+"4";
                break;
            case R.id.five:
                numbers=numbers+"5";

                break;
            case R.id.six:
                numbers=numbers+"6";
                break;
            case R.id.seven:
                numbers=numbers+"7";
                break;
            case R.id.eigth:
                numbers=numbers+"8";
                break;
            case R.id.nine:
                numbers=numbers+"9";
                break;
            case R.id.zero:
                numbers=numbers+"0";
                break;
            case R.id.ac:
                numbers="0";
                break;
            case R.id.point:
                numbers=numbers+".";
                break;
            case R.id.delete:
                if(!numbers.isEmpty()){
                numbers=numbers.substring(0,numbers.length()-1); }
                break;

        }
        result.setText(numbers);
    }

    public void eventOperator(View view) {
        isNewOp = true;
        oldnumber=result.getText().toString();
        switch (view.getId()){
            case R.id.divide:
                    op=":";
                    break;
            case R.id.multiply:
                op="*";
                break;
            case R.id.add:
                op="+";
                break;
            case R.id.substract:
                op="-";
                break;
        }
    }

    public void eventEqual(View view) {
        String newNumber=result.getText().toString();
        double resltcode=0.0;
        switch (op){
            case "+":
                resltcode=Double.parseDouble(oldnumber)+Double.parseDouble(newNumber);
                break;
            case "*":
                resltcode=Double.parseDouble(oldnumber)*Double.parseDouble(newNumber);
                break;
            case "-":
                resltcode=Double.parseDouble(oldnumber)-Double.parseDouble(newNumber);
                break;
            case ":":
                resltcode=Double.parseDouble(oldnumber)/Double.parseDouble(newNumber);
                break;
        }
        result.setText(resltcode+"");
    }
}