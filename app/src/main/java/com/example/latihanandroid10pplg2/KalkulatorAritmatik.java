package com.example.latihanandroid10pplg2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class KalkulatorAritmatik extends AppCompatActivity {
    //list widget
    EditText txtAngka1;
    EditText txtAngka2;
    Spinner spOperator;
    TextView tvHasil;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_aritmatik);
        //konek ke layout
        txtAngka1 = findViewById(R.id.txtAngkaSatu);
        txtAngka2 = findViewById(R.id.txtAngkaDua);
        tvHasil = findViewById(R.id.tvHasil);
    }
}