package com.example.trabalho_mobile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.text.DecimalFormat;

import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Acccalculadora extends AppCompatActivity {

    private EditText inputNumber;
    private TextView resultTextView;
    private Button calculateButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acccalculadora);

        inputNumber = findViewById(R.id.input_number);
        resultTextView = findViewById(R.id.result_text_view);
        calculateButton = findViewById(R.id.calculate_button);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputNumber.getText().toString();
                if (!input.isEmpty()) {
                    double number = Double.parseDouble(input);
                    double result = number / 2;

                    DecimalFormat df = new DecimalFormat("#,###,###.##");
                    String formattedResult = df.format(result);

                    String displayText = formattedResult + " Pontos!!";
                    resultTextView.setText(displayText);
                }
            }
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if (item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}