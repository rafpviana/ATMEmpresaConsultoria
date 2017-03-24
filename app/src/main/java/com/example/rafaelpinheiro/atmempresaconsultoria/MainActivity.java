package com.example.rafaelpinheiro.atmempresaconsultoria;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imagemMenuEmpresa;
    private ImageView imagemMenuServicos;
    private ImageView imagemMenuClientes;
    private ImageView imagemMenuContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagemMenuEmpresa = (ImageView) findViewById(R.id.imagemMenuEmpresaId);

        imagemMenuEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EmpresaActivity.class));
            }
        });

        imagemMenuServicos = (ImageView) findViewById(R.id.imagemMenuServicosId);
        imagemMenuServicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ServicosActivity.class));
            }
        });

        imagemMenuClientes = (ImageView) findViewById(R.id.imagemMenuClientesId);
        imagemMenuClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ClientesActivity.class));
            }
        });

        imagemMenuContato = (ImageView) findViewById(R.id.imagemMenuContatoId);
        imagemMenuContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ContatoActivity.class));
            }
        });


    }
}
