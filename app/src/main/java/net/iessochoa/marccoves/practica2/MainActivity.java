package net.iessochoa.marccoves.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btAgenda;
    Button btCalculadora;
    Button btReceta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btAgenda=findViewById(R.id.btAgenda);
        btCalculadora=findViewById(R.id.btCalculadora);
        btReceta=findViewById(R.id.btReceta);

        btAgenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent=new Intent(MainActivity.this, AgendaActivity.class);
            startActivity(intent);
            }
        });

        btCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, CalculadoraActivity.class);
                startActivity(intent);
            }
        });

        btReceta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, RecetaActivity.class);
                startActivity(intent);
            }
        });
    }
}
