package com.example.prestamo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ClienteActivity extends AppCompatActivity {
    private  ArrayAdapter<String> adapter;
    public List<String> temp = new ArrayList<>();
   public  TextView nombre;
   public   TextView apellido;
   public TextView telefono;
   public  TextView cedula;
   public  TextView direccion;
   public  TextView ocupacion;
   public  TextView sexo ;
   public  int i=0;
    public List<String> temp1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);




       nombre = findViewById(R.id.nombre);
        apellido = findViewById(R.id.apellidoc);
        telefono = findViewById(R.id.telefono);
        cedula = findViewById(R.id.cedula);
        direccion = findViewById(R.id.direccion);
         ocupacion = findViewById(R.id.ocupacion);
        sexo = findViewById(R.id.sexo);

            nombre.setText(Datos.clientes.get(i).getNombre());
            apellido.setText(Datos.clientes.get(i).getApellido());
            telefono.setText(Datos.clientes.get(i).getTelefono());
            cedula.setText(Datos.clientes.get(i).getCedula());
            direccion.setText(Datos.clientes.get(i).getDireccion());
            ocupacion.setText(Datos.clientes.get(i).getOcupacion());
            sexo.setText(Datos.clientes.get(i).getSexo());




    }

    public void onClick3(View view) {
        if (view.getId() == R.id.npres) {
            Intent intent1 = new Intent(ClienteActivity.this, Main2ActivityRegistro.class);
            //intent1.putExtra("res",nombre.getText().toString());
            startActivity(intent1);
        } else
            if (view.getId() == R.id.btnsig) {
                i = i++;
                if (i < Datos.clientes.size()) {
                    nombre.setText(Datos.clientes.get(i++).getNombre());
                    apellido.setText(Datos.clientes.get(i++).getApellido());
                    telefono.setText(Datos.clientes.get(i++).getTelefono());
                    cedula.setText(Datos.clientes.get(i++).getCedula());
                    direccion.setText(Datos.clientes.get(i++).getDireccion());
                    ocupacion.setText(Datos.clientes.get(i++).getOcupacion());
                    sexo.setText(Datos.clientes.get(i++).getSexo());
                }

            }



    }}
