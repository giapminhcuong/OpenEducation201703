package com.cuong.android.android_06_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    // Khai báo biến widgets
    private TextView mTextViewOperator;
    private TextView mTextViewResult;
    // Hàng 1
    private Button mButtonAc;
    private Button mButtonNegative;
    private Button mButtonPercent;
    private Button mButtonDivide;
    // Hàng 2
    private Button mButton7;
    private Button mButton8;
    private Button mButton9;
    private Button mButtonMultiply;
    // Hàng 3
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;
    private Button mButtonMinus;
    // Hàng 4
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButtonPlus;
    // Hàng 5
    private Button mButton0;
    private Button mButtonPeriod;
    private Button mButtonEqual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        getReferences();
    }

    // Nhận tham chiếu
    private void getReferences() {
        mTextViewOperator = (TextView) findViewById(R.id.textview_operator);
        mTextViewResult = (TextView) findViewById(R.id.textview_result);

        mButtonAc = (Button) findViewById(R.id.button_ac);
        mButtonNegative = (Button) findViewById(R.id.button_negative_sign);
        mButtonPercent = (Button) findViewById(R.id.button_percent);
        mButtonDivide = (Button) findViewById(R.id.button_divide);

        mButton7 = (Button) findViewById(R.id.button_7);
        mButton8 = (Button) findViewById(R.id.button_8);
        mButton9 = (Button) findViewById(R.id.button_9);
        mButtonMultiply = (Button) findViewById(R.id.button_multiply);

        mButton4 = (Button) findViewById(R.id.button_4);
        mButton5 = (Button) findViewById(R.id.button_5);
        mButton6 = (Button) findViewById(R.id.button_6);
        mButtonMinus = (Button) findViewById(R.id.button_minus);

        mButton1 = (Button) findViewById(R.id.button_1);
        mButton2 = (Button) findViewById(R.id.button_2);
        mButton3 = (Button) findViewById(R.id.button_3);
        mButtonPlus = (Button) findViewById(R.id.button_plus);

        mButton0 = (Button) findViewById(R.id.button_0);
        mButtonPeriod = (Button) findViewById(R.id.button_period);
        mButtonEqual = (Button) findViewById(R.id.button_equal);
    }
}
