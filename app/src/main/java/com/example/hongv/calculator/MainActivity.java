package com.example.hongv.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView tv_calculator;
    private TextView tv_result;
    private Button btnMC;
    private Button btnMR;
    private Button btnMS;
    private Button btnMPlus;
    private Button btnMMinus;
    private Button btnArrow;
    private Button btnCE;
    private Button btnC;
    private Button btnPlusMinus;
    private Button btnSqrt;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnSlash;
    private Button btnPercent;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btnMultiply;
    private Button btnDivide;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btnMinus;
    private Button btn0;
    private Button btnPlus;
    private Button btnComma;
    private Button btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        setEventClickView();
    }
    public void initWidget() {
        tv_calculator = findViewById(R.id.tv_calculator);
        tv_result = findViewById(R.id.tv_result);
        btnMC = findViewById(R.id.btnMC);
        btnMR = findViewById(R.id.btnMR);
        btnMS = findViewById(R.id.btnMS);
        btnMPlus= findViewById(R.id.btnMPlus);
        btnMMinus = findViewById(R.id.btnMMinus);
        btnArrow = findViewById(R.id.btnArrow);
        btnCE = findViewById(R.id.btnCE);
        btnC = findViewById(R.id.btnC);
        btnPlusMinus = findViewById(R.id.btnPlusMinus);
        btnSqrt = findViewById(R.id.btnSqrt);
        btnSlash = findViewById(R.id.btnSlash);
        btnPercent = findViewById(R.id.btnPercent);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnComma = findViewById(R.id.btnComma);
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
        btnResult = findViewById(R.id.btnResult);
    }
    public void setEventClickView () {
        btnMultiply.setOnClickListener(this);
        btnSlash.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnResult.setOnClickListener(this);

        btn9.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn0.setOnClickListener(this);

        btnComma.setOnClickListener(this);
        btnC.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn0:
                tv_calculator.append("0");
                break;
            case R.id.btn1:
                tv_calculator.append("1");
                break;
            case R.id.btn2:
                tv_calculator.append("2");
                break;
            case R.id.btn3:
                tv_calculator.append("3");
                break;
            case R.id.btn4:
                tv_calculator.append("4");
                break;
            case R.id.btn5:
                tv_calculator.append("5");
                break;
            case R.id.btn6:
                tv_calculator.append("6");
                break;
            case R.id.btn7:
                tv_calculator.append("7");
                break;
            case R.id.btn8:
                tv_calculator.append("8");
                break;
            case R.id.btn9:
                tv_calculator.append("9");
                break;
            case R.id.btnPlus:
                if(tv_calculator.getText()!=null&&checkString()==1){

                    tv_calculator.append("+");

                }
                break;
            case R.id.btnMinus:
                if(tv_calculator.getText()!=null&&checkString()==1){

                    tv_calculator.append("-");

                }
                break;
            case R.id.btnMultiply:
                if(tv_calculator.getText()!=null&&checkString()==1){

                    tv_calculator.append("*");

                }
                break;
            case R.id.btnSlash:
                if(tv_calculator.getText()!=null&&checkString()==1){
                    tv_calculator.append("/");
                }
                break;
            case R.id.btnComma:
                if(tv_calculator.getText()!=null&&checkString()==1){

                    tv_calculator.append(".");

                }
            case R.id.btnC:
                BaseInputConnection textFieldInputConnection = new BaseInputConnection(tv_calculator, true);
                textFieldInputConnection.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL));
                break;
        }
    }
    public  char getLastLetter () {
        String tem = tv_calculator.getText().toString();
        char lastLetter = tem.charAt(tem.length()-1);
        return  lastLetter;
    }
    public int checkString () {
        char lastLetter = getLastLetter();
        if (lastLetter=='+'||lastLetter=='-'||lastLetter=='*'||lastLetter=='/'||lastLetter=='.') return 0;
        return 1;
    }

}
