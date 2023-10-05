package com.semana7;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AResultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aresultado);

        String nombreFoto = getIntent().getStringExtra("STNombre");

        TextView TVResultado = findViewById(R.id.TVResultado);
        TVResultado.setText("Resultado: " + nombreFoto);
    }
}
