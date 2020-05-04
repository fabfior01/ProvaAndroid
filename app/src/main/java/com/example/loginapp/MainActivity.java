package com.example.loginapp;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText nome;
    TextView messaggio;
    Button annulla;
    Button verifica;
    Toast t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //qui vengono generati tutti gli indici

        nome = findViewById(R.id.nome); //creo l'oggetto
        annulla = findViewById(R.id.buttonannulla); //creo


        annulla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //cancella la cesella di testo
                nome.setText("Ciao");
            }
        });

        startActivity(validateRequestPermissionsRequestCode( int));

        //Toast t=Toast.makeText(this, "Prova", Toast.LENGTH_SHORT).show();

        public void invia (View View){
            //Intent i = new Intent(getApplicationContext());
        }
    }

    Log.d(Tag  );

    @Override
    public void startActivityForResult(Intent intent, int requestCode) {
        super.startActivityForResult(intent, requestCode);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    private Intent validateRequestPermissionsRequestCode() {
    }
}
