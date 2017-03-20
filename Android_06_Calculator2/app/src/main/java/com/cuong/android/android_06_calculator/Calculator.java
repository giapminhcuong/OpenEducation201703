package com.cuong.android.android_06_calculator;

import android.support.v4.text.BidiFormatter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;

public class Calculator extends AppCompatActivity implements View.OnClickListener {

    private final int mMaxLength = 9;

    BigDecimal num1 = new BigDecimal("0.0");

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
        setOnClickListeners();
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

    private void setOnClickListeners() {
        mButton0.setOnClickListener(this);
        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mButton4.setOnClickListener(this);
        mButton5.setOnClickListener(this);
        mButton6.setOnClickListener(this);
        mButton7.setOnClickListener(this);
        mButton8.setOnClickListener(this);
        mButton9.setOnClickListener(this);

        mButtonAc.setOnClickListener(this);
        mButtonNegative.setOnClickListener(this);
        mButtonPeriod.setOnClickListener(this);

        mButtonPlus.setOnClickListener(this);
        mButtonMinus.setOnClickListener(this);
        mButtonMultiply.setOnClickListener(this);
        mButtonDivide.setOnClickListener(this);

        mButtonEqual.setOnClickListener(this);
        mButtonPercent.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_0:
            case R.id.button_1:
            case R.id.button_2:
            case R.id.button_3:
            case R.id.button_4:
            case R.id.button_5:
            case R.id.button_6:
            case R.id.button_7:
            case R.id.button_8:
            case R.id.button_9:
                addDigit(view);
                break;
            case R.id.button_ac:
                delLastChar();
                break;
            case R.id.button_negative_sign:
                addNegativeSign();
                break;
            case R.id.button_period:
                addPeriod();
                break;
            case R.id.button_plus:
            case R.id.button_minus:
            case R.id.button_multiply:
            case R.id.button_divide:
                cal(view);
                break;
            case R.id.button_equal:
                eq();
                break;
            case R.id.button_percent:
                percent();
                break;
        }
    }

    private void addDigit(View v) {
        if (!checkValidNumber(mTextViewResult.getText().toString())) {
            return;
        }
        if (checkMaxLength(mMaxLength, mTextViewResult.getText().toString())) return;
        Button button = (Button) v;
        String digit = button.getText().toString();
        String currentNumber = mTextViewResult.getText().toString();
        float value = Float.parseFloat(currentNumber);
        if (value == 0 && currentNumber.length()==1 && !digit.equals("0")) {
            mTextViewResult.setText(digit);
        }
        else if (value != 0 || !digit.equals("0")) { // điều kiện kiểm tra nếu thêm vào số 0 sau số 0 thì giá trị không thay đổi
            mTextViewResult.setText(mTextViewResult.getText().toString() + digit);
        }
    }

    private void delLastChar() {
        String currentNumber = mTextViewResult.getText().toString();
        // kiem tra so hay chu
        if (!checkValidNumber(currentNumber)) {
            mTextViewResult.setText("0");
            return;
        }
        if (currentNumber.length()==1 && currentNumber.equals("0")) {
            mTextViewOperator.setText("");
            num1 = new BigDecimal("0.0");
        }
        else if (currentNumber.length()==2 && (new StringBuffer(currentNumber)).charAt(0) == '-') {
            mTextViewResult.setText((new StringBuffer(mTextViewResult.getText()).deleteCharAt(0).toString()));
        }
        // Trường hợp số đang có 2 kí tự
        else if (currentNumber.length()>1) {
            mTextViewResult.setText((new StringBuffer(currentNumber)).deleteCharAt(currentNumber.length()-1).toString());
        }
        else {
            mTextViewResult.setText("0");
        }
    }

    private void addNegativeSign() {
        // kiem tra so hay chu
        if (!checkValidNumber(mTextViewResult.getText().toString())) {
            return;
        }
        String currentNumber = mTextViewResult.getText().toString();
        if (currentNumber.length()==1 && currentNumber.equals("0")) {
            // giữ nguyên
        }
        else if ((new StringBuffer(currentNumber)).charAt(0) != '-') {
            mTextViewResult.setText("-" + currentNumber);
        } else {
            mTextViewResult.setText((new StringBuffer(currentNumber)).deleteCharAt(0).toString());
        }
    }

    private void addPeriod() {
        // kiem tra so hay chu
        if (!checkValidNumber(mTextViewResult.getText().toString())) {
            return;
        }
        if (checkMaxLength(mMaxLength, mTextViewResult.getText().toString())) return;
        String currentNumber = mTextViewResult.getText().toString();
        if (!currentNumber.contains(".")) {
            mTextViewResult.setText(currentNumber + ".");
        }
    }

    private boolean checkMaxLength(int maxLength, String src) {
        int count = 0; // Đếm số digit
        for (char ch : src.toCharArray()) {
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        return (count < maxLength) ? false : true;
    }

    private boolean checkValidNumber(String src) {
        for (char ch : src.toCharArray()) {
            if (Character.isLetter(ch)) {
                return false;
            }
        }
        return true;
    }

    private void cal(View v) {
        // kiem tra so hay chu
        if (!checkValidNumber(mTextViewResult.getText().toString())) {
            return;
        }
        Button button = (Button) v;
        String buttonSign = button.getText().toString();
        String operator = mTextViewOperator.getText().toString();
        if (buttonSign.equals(operator)) {
            mTextViewOperator.setText("");
            mTextViewResult.setText(parseNumberToString(num1));
            num1 = new BigDecimal("0.0");
            return;
        }
        if (num1.doubleValue() == 0d) {
            num1 = new BigDecimal(mTextViewResult.getText().toString());
            Log.d("AAA", "num1 = " + num1);
        }
        mTextViewResult.setText("0");
        mTextViewOperator.setText(button.getText());
    }

    private void eq() {
        // kiem tra so hay chu
        if (!checkValidNumber(mTextViewResult.getText().toString())) {
            return;
        }
        BigDecimal num2 = new BigDecimal(mTextViewResult.getText().toString());
        if (num2.doubleValue() == 0d && mTextViewOperator.getText().toString().equals(":")) {
            mTextViewResult.setText("Lỗi chia 0");
            // reset
            num1 = new BigDecimal("0.0");
            mTextViewOperator.setText("");
            return;
        }
        BigDecimal result = new BigDecimal("0.0");
        switch (mTextViewOperator.getText().toString()) {
            case "+": result = num1.add(num2); break;
            case "-": result = num1.subtract(num2); break;
            case "x": result = num1.multiply(num2); break;
            case ":": result = num1.divide(num2); break;
        }
        if (checkMaxLength(mMaxLength, result.toString())) {
            mTextViewResult.setText("K.Quả quá dài");
            // reset
            num1 = new BigDecimal("0.0");
            mTextViewOperator.setText("");
            return;
        }
        mTextViewResult.setText(parseNumberToString(result));
        // reset
        num1 = new BigDecimal("0.0");
        mTextViewOperator.setText("");
    }

    private String parseNumberToString(BigDecimal num) {
        double d = num.doubleValue();
        if (d == Math.round(d)) {   // kiem tra phan du co = 0 hay khong
            return new String(num.intValueExact() + "");
        } else {
            return new String(num.doubleValue() + "");
        }
    }

    private void percent() {
        // kiem tra so hay chu
        if (!checkValidNumber(mTextViewResult.getText().toString())) {
            return;
        }
        String result = (new BigDecimal(mTextViewResult.getText().toString())).divide(new BigDecimal("100.0")).toString();
        if (checkMaxLength(mMaxLength, result)) {
            return;
        }
        mTextViewResult.setText(result);
    }
}
