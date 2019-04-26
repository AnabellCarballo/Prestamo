package com.example.prestamo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ClienteActivity extends AppCompatActivity {

   public  TextView nombre = findViewById(R.id.nombre);
   public  TextView apellido = findViewById(R.id.apellido);
   public TextView telefono =findViewById(R.id.telefono);
   public  TextView cedula = findViewById(R.id.cedula);
   public  TextView direccion = findViewById(R.id.direccion);
   public  TextView ocupacion =  findViewById(R.id.ocupacion);
   public  TextView sexo  = findViewById(R.id.sexo);
   public  int i=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);

    }
    public  void mostrar (){
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
//        } else
//            if (view.getId() == R.id.btnsig) {
//                if (i < Datos.clientes.size()-1)
//                    Toast.makeText(this, "Es5e es el ultimo registro", Toast.LENGTH_SHORT).show();
//                else
//                {
//                    i= i +1;
//                    mostrar();
//                }
//
//            }
//            else
//                if (view.getId()== R.id.btnatras)
//                {
//                    if (i ==0 )
//                        Toast.makeText(this, "Es5e es el primern registro", Toast.LENGTH_SHORT).show();
//                    else
//                    {
//                        i= i -1;
//                        mostrar();
//                    }
//                }


        }}}
