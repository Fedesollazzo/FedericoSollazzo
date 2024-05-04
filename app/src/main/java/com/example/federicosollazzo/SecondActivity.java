package com.example.federicosollazzo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second); // Asegúrate de tener un archivo activity_second.xml en res/layout

        // Obtener referencia al botón "Salir"
        Button btnSalir = findViewById(R.id.btnSalir);

        // Obtener referencia al botón "Acerca de"
        Button btnAcercaDe = findViewById(R.id.btnAcercaDe);

        // Configurar el texto de los botones utilizando los recursos de strings
        btnSalir.setText(R.string.btn_salir);
        btnAcercaDe.setText(R.string.btn_acercade);

        // Configurar el listener del botón "Salir"
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implementar la lógica para regresar a la MainActivity
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Cerrar la SecondActivity para evitar que quede en la pila de actividades
            }
        });

        // Configurar el listener del botón "Acerca de"
        btnAcercaDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implementar la lógica para abrir la actividad "Acerca de"
                Intent intent = new Intent(SecondActivity.this, AcercaDeActivity.class);
                startActivity(intent);
            }
        });
    }
}