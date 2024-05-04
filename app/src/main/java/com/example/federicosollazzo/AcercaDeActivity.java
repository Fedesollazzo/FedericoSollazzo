package com.example.federicosollazzo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class AcercaDeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);

        // Obtener referencia al botón "Volver"
        Button btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setText(R.string.btn_volver);

        // Configurar el listener del botón "Volver"
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implementar la lógica para regresar a la SecondActivity
                Intent intent = new Intent(AcercaDeActivity.this, SecondActivity.class);
                startActivity(intent);
                finish(); // Cerrar la AcercaDeActivity para evitar que quede en la pila de actividades
            }
        });

        // Implementar intent implícito para enviar correo electrónico
        Button btnCorreo = findViewById(R.id.btnLlamar);
        btnCorreo.setText(R.string.btn_correo);
        btnCorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:Fedesollazzo23@gmail.com"));
                startActivity(intent);
            }
        });

        // Implementar intent implícito para realizar llamada telefónica
        Button btnLlamar = findViewById(R.id.btnLlamar);
        btnLlamar.setText(R.string.btn_llamar);
        btnLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:2954-657764"));
                startActivity(intent);
            }
        });
    }
}