package com.example.pruebaappsmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtVal1, edtVal2;
    TextView txtresultado;
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtVal1 = findViewById(R.id.edtVal1);
        edtVal2 =findViewById(R.id.edtVal2);
        txtresultado = findViewById(R.id.txtresultado);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String caja1 = edtVal1.getText().toString();
                String caja2 = edtVal2.getText().toString();

                if (!caja1.equals("") && !caja2.equals("")) {
                    int total = Integer.parseInt(caja1) + Integer.parseInt(caja2);
                    txtresultado.setText(total+"");
                }else {
                    Toast.makeText(MainActivity.this, "Es necesario ingresar un número", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}