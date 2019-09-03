package com.example.somandoentreactivitys;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public static final int CODIGO_ACTIVITY_ENRADA_DADOS = 2;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == CODIGO_ACTIVITY_ENRADA_DADOS) {
            TextView tvResultado = findViewById(R.id.tvResultado);

            int resultado = data.getIntExtra("resultado" , -1);

            if(resultado >= 0 ) {
                String sResultado = String.valueOf(resultado);
                tvResultado.setText(sResultado);
            } else {
                tvResultado.setText("Deu algum erro");
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void abrirActicity2(View v) {
        Intent i = new Intent(this, EntradaValoresActivity.class);

        this.startActivityForResult(i, CODIGO_ACTIVITY_ENRADA_DADOS);
    }


}
