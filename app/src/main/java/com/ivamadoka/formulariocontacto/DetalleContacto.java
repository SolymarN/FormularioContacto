package com.ivamadoka.formulariocontacto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class DetalleContacto extends AppCompatActivity {

    TextView tvNombre;
    TextView tvFechaNacimiento;
    TextView tvTelefono;
    TextView tvEmail;
    TextView tvDescripcion;
    TextInputLayout tilNombre;
    Button btnEditar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_contacto);
        Log.i("detalleContacto","detalle contacto.java");

        tvNombre = findViewById(R.id.tvNombre);
        tvFechaNacimiento = findViewById(R.id.tvFechaNacimiento);
        tvTelefono =  findViewById(R.id.tvTelefono);
        tvEmail = findViewById(R.id.tvEmail);
        tvDescripcion = findViewById(R.id.tvDescripcion);
        btnEditar = findViewById(R.id.btnEditar);

        Bundle parametros = getIntent().getExtras();
        String nombre = parametros.getString(getResources().getString(R.string.pnombre));
        String fecha = parametros.getString(getResources().getString(R.string.pfecha_nac));
        String telefono = parametros.getString(getResources().getString(R.string.ptelefono));
        String email = parametros.getString(getResources().getString(R.string.pemail));
        String descripcion = parametros.getString(getResources().getString(R.string.pdescripcion));
        Log.i("detalleContactoNombre",nombre);
        Log.i("detalleContactoTelefono",telefono);

        tvNombre.setText(nombre);
        tvFechaNacimiento.setText(fecha);
        tvTelefono.setText(telefono);
        tvEmail.setText(email);
        tvDescripcion.setText(descripcion);

        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}