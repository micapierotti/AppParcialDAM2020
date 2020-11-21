package com.mpierotti.appparcialdam2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private EditText titulo, autor;
    private ToggleButton esUsado;
    private Button botonGuardar;
    private boolean libroUsado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titulo = findViewById(R.id.tituloLibro);
        autor = findViewById(R.id.autorLibro);
        esUsado = findViewById(R.id.toggleButton);
        botonGuardar = findViewById(R.id.button);
        esUsado.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    libroUsado=true;
                }else{
                    libroUsado=false;
                }
            }
        });
        botonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Libro libro = new Libro (titulo.getText().toString(), autor.getText().toString(), libroUsado);
                
            }
        });
        
    }

}