package com.example.federicosollazzo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnIniciar = findViewById(R.id.btniniciar);
        btnIniciar.setText(R.string.btn_iniciar);
        EditText tUsuario = findViewById(R.id.tusuario);
        tUsuario.setHint(R.string.hint_usuario);

        EditText tContraseña = findViewById(R.id.tcontraseña);
        tContraseña.setHint(R.string.hint_contraseña);

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = tUsuario.getText().toString();
                String contraseña = tContraseña.getText().toString();

                if (usuario.equals("alumno") && contraseña.equals("1234")) {
                    // Verificación exitosa, abrir la nueva actividad
                    Toast.makeText(MainActivity.this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                } else {
                    // Verificación fallida, mostrar un mensaje de error
                    Toast.makeText(MainActivity.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}