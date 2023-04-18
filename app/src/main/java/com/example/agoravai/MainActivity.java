package com.example.agoravai;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText rEditProduto1, rEditProduto2, rEditProduto3, rEditProduto4, rEditProduto5;
    private TextView rTextTotal, rTextMedia, rTextComprador, rTextMudarNome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rEditProduto1 = findViewById(R.id.editValor1);
        rEditProduto2 = findViewById(R.id.editValor2);
        rEditProduto3 = findViewById(R.id.editValor3);
        rEditProduto4 = findViewById(R.id.editValor4);
        rEditProduto5 = findViewById(R.id.editValor5);

        rTextTotal = findViewById(R.id.textTotal);
        rTextMedia = findViewById(R.id.textMedio);
        rTextComprador = findViewById(R.id.editComprador);
        rTextMudarNome = findViewById(R.id.textMudarNome);

    }

    public void calcular(View view) {

        double valor1, valor2, valor3, valor4, valor5, media, total;

        valor1 = Double.parseDouble(rEditProduto1.getText().toString());
        valor2 = Double.parseDouble(rEditProduto2.getText().toString());
        valor3 = Double.parseDouble(rEditProduto3.getText().toString());
        valor4 = Double.parseDouble(rEditProduto4.getText().toString());
        valor5 = Double.parseDouble(rEditProduto5.getText().toString());


        total = (valor1 + valor2 + valor3 + valor4 + valor5);
        media = (valor1 + valor2 + valor3 + valor4 + valor5) / 5;

        rTextTotal.setText((int) total);
        rTextTotal.setTextColor(Color.parseColor("#008000"));

        rTextMedia.setText((int)media);
        
        rTextMudarNome.setText(rTextComprador.getText().toString());

    }

}