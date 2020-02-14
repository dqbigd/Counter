package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnUp, btnDown, btnReset, btnSet;
    EditText txtCounter;
    TextView tvCounter;

    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUp = findViewById(R.id.btnUp);
        btnDown = findViewById(R.id.btnDown);
        btnReset = findViewById(R.id.btnReset);
        btnSet = findViewById(R.id.btnSet);
        txtCounter = findViewById(R.id.txtCounter);
        tvCounter = findViewById(R.id.tvCounter);

        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int setnew = Integer.valueOf(txtCounter.getText().toString());
                count = setnew;
                tvCounter.setText(String.valueOf(count));
                txtCounter.setText(String.valueOf(count));
            }
        });

        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = count + 1;
                tvCounter.setText(String.valueOf(count));
                txtCounter.setText(String.valueOf(count));

                if (count < 0){
                    Toast.makeText(MainActivity.this, "Negative counter", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = count - 1;
                tvCounter.setText(String.valueOf(count));
                txtCounter.setText(String.valueOf(count));

                if (count < 0){
                    Toast.makeText(MainActivity.this, "Negative counter", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                tvCounter.setText(String.valueOf(count));
                txtCounter.setText(String.valueOf(count));
            }
        });


    }

}
