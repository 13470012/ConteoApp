package com.josecan.android.contadorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    int conteo = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText conteoEditText = (EditText) findViewById(R.id.conteo_edit_text);
        Button contadorButton = (Button) findViewById(R.id.contador_button);
        Button reiniciarButton = (Button) findViewById(R.id.reiniciar_button);

        contadorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conteo ++;
                conteoEditText.setText(Integer.toString(conteo));
            }
        });

        reiniciarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conteo = 0;
                conteoEditText.setText(Integer.toString(conteo));
            }
        });
    }
}
