package com.example.androidlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class AlgorithmicsActivity extends AppCompatActivity {

    private TextView inputDigitTextView;
    private EditText sumEditText;
    private TextView inputStringView;
    private EditText reversedStringText;
    private AlgorithmicsUtils algorithmicsUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorithmics);

        inputDigitTextView = findViewById(R.id.input_digit_text_view);
        sumEditText = findViewById(R.id.sum_edit_text);
        inputStringView = findViewById(R.id.input_string_view);
        reversedStringText = findViewById(R.id.reversed_string_text);

        sumEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                algorithmicsUtils = AlgorithmicsUtils.getInstance();
                inputDigitTextView.setText(algorithmicsUtils.stringToInteger(s.toString()));
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        reversedStringText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                algorithmicsUtils = AlgorithmicsUtils.getInstance();
                inputStringView.setText(algorithmicsUtils.reverseStringByThreeSymbols(s.toString()));
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }
}