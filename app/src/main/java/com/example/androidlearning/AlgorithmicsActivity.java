package com.example.androidlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmicsActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorithmics);

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                int sum = 0;
                List<Character> list = new ArrayList<>();
                for (int i = 0; i < s.length(); i++) {
                    list.add(s.charAt(i));
                    int digitChar = Character.getNumericValue(s.charAt(i));
                    sum += digitChar;
                }
                textView.setText(String.valueOf(sum));

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

}




