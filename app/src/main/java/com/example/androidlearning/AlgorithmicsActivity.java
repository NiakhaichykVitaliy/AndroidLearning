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
                int sum = 0;
                for (int i = 0; i < s.length(); i++) {
                    int digitChar = Character.getNumericValue(s.charAt(i));
                    sum += digitChar;
                }
                inputDigitTextView.setText(String.valueOf(sum));

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

                inputStringView.setText(reverseString(s.toString()));
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    private String reverseString(String str) {
        StringBuilder result = new StringBuilder();

        while (str.length() >= 3) {
            String k = str.substring(0, 3);
            result.append(recursiveReverse(k));
            str = str.substring(3);
        }
        str = recursiveReverse(str);
        result.append(str);

        return result.toString();
    }

    private String recursiveReverse(String s) {
        StringBuffer buffer = new StringBuffer(s);
        s = buffer.reverse().toString();
        return s;
    }
}




