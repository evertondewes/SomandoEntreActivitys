package com.example.somandoentreactivitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EntradaValoresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada_valores);
    }

    public  void somarERetornar(View v){
        EditText valor1 = findViewById(R.id.etValor1);
        EditText valor2 = findViewById(R.id.etValor2);

        int v1 = Integer.parseInt(valor1.getText().toString());
        int v2 = Integer.parseInt(valor2.getText().toString());

        Intent i = new Intent();
        i.putExtra("resultado" , (v1 + v2));

        setResult(RESULT_OK, i);

        finish();
    }
}
