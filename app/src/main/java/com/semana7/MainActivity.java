package com.semana7;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Método llamado cuando se hace clic en el botón "Ir a Inicio"
    public void goToInicio(View view) {
        Intent intent = new Intent(this, Inicio.class);
        startActivity(intent);
    }
}
