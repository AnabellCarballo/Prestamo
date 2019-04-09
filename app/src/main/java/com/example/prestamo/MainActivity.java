package com.example.prestamo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button continuar = findViewById(R.id.button);
        continuar.setOnClickListener(new View.OnClickListener() {




            public void onClick(View v ) {
                EditText nombre = findViewById(R.id.nombre);
                EditText cedula = findViewById(R.id.cedula);
                EditText telefono = findViewById(R.id.telefono);
                EditText direccion = findViewById(R.id.direccion);


//                    switch (v.getId())
//                    {
//                        case R.id.nombre:
//
//                            if(nombre.getText().toString().isEmpty()) {
//                                nombre.setError("Debe ser llenado el campo");}
//                        case R.id.cedula:
//                           if(cedula.getText().toString().isEmpty()){
//                              cedula.setError("Debe ser llenado el campo");}
//                              break;
//
//                         case R.id.telefono:
//                             if(telefono.getText().toString().isEmpty()){
//                                telefono.setError("Debe ser llenado el campo");
//                            }
//                            break;
//                        case R.id.direccion:
//                            if(direccion.getText().toString().isEmpty()) {
//                                direccion.setError("Debe ser llenado el campo");
//                                break;
//
//
//                            }
//                            default:
//                                while()
//                                }
//                                Intent intent = new Intent( getApplicationContext(), Main2ActivityRegistro.class);
//                                startActivity(intent);
//                                break;}
////
//
//
//                }
////
                if (!nombre.getText().toString().isEmpty() && !telefono.getText().toString().isEmpty() && !cedula.getText().toString().isEmpty() && !direccion.getText().toString().isEmpty()) {

                    Intent intent = new Intent(getApplicationContext(), Main2ActivityRegistro.class);
                    startActivity(intent);
                } else {
                    if(nombre.getText().toString().isEmpty()) {
                                nombre.setError("Debe ser llenado el campo");}
                                else
                                    if(telefono.getText().toString().isEmpty()){
                                telefono.setError("Debe ser llenado el campo");}

                                else  if(cedula.getText().toString().isEmpty()) {
                                    cedula.setError("Debe ser llenado el campo");
                                }
                                else if(direccion.getText().toString().isEmpty()){
                                                direccion.setError("Debe ser llenado el campo");
                                            }

//                    nombre.setError("Debe ser llenado el campo");
//                    cedula.setError("Debe ser llenado el campo");
//                    telefono.setError("Debe ser llenado el campo");
//                    direccion.setError("Debe ser llenado el campo");
                }

//                if(!cedula.getText().toString().isEmpty()){
//                    cedula.setError("Debe ser llenado el campo");
//                }
//                if(!telefono.getText().toString().isEmpty()){
//                    telefono.setError("Debe ser llenado el campo");
//                }
//                if(!direccion.getText().toString().isEmpty()){
//                    direccion.setError("Debe ser llenado el campo");
//                }
//                if (v.getId()==R.id.button)
//                {
//                    Intent intent = new Intent( getApplicationContext(), Main2ActivityRegistro.class);
//                    startActivity(intent);
//
////                }


            }
                });
            }
        }


