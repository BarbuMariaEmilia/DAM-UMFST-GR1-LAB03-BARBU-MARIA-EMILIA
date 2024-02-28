package com.example.lab3;

import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    TextView tv;
    int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_main);

     tv = findViewById(R.id.textView);

    }
    public void showToast(View view) {
        Toast.makeText(this,tv.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void incrementValue(View view) {
        a++;
        tv.setText(String.valueOf(a));
    }
}