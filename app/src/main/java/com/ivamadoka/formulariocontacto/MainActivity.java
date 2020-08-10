package com.ivamadoka.formulariocontacto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Button btnSiguiente;
    EditText nombre;
    EditText telefono;
    EditText email;
    EditText descripcion;
    DatePicker fechaNacimiento;
    private int year;
    private int month;
    private int day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSiguiente = findViewById(R.id.button_siguiente);
        nombre = (EditText) findViewById(R.id.tietNomnbre);
        telefono = (EditText) findViewById(R.id.tietTelefono);
        email = (EditText) findViewById(R.id.tietEmail);
        descripcion = (EditText) findViewById(R.id.tietDescripcion);
        fechaNacimiento = (DatePicker) findViewById(R.id.dpFechaNac);

        final Calendar c = Calendar.getInstance();
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);


        day = fechaNacimiento.getDayOfMonth();
        month = fechaNacimiento.getMonth()+1;
        year = fechaNacimiento.getYear();

        //siempre es con click listener
        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("dia ", String.valueOf(day));
                Log.i("mes ", String.valueOf(month));
                Log.i("aÑo ", String.valueOf(year));
                String fechaCompleta = String.valueOf(day) + "/" + String.valueOf(month) + "/" + String.valueOf(year);

                Intent intent = new Intent(MainActivity.this, DetalleContacto.class);
                intent.putExtra(getResources().getString(R.string.pnombre), nombre.getText().toString());
                intent.putExtra(getResources().getString(R.string.pfecha_nac), fechaCompleta);
                intent.putExtra(getResources().getString(R.string.ptelefono), telefono.getText().toString());
                intent.putExtra(getResources().getString(R.string.pemail), email.getText().toString());
                intent.putExtra(getResources().getString(R.string.pdescripcion), descripcion.getText().toString());
                Log.i("iniciando intent", "si incio");
                startActivity(intent);

            }
        });

        //se elimina la actividad
        //   finish();
    }

}