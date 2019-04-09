package com.example.prestamo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Main2ActivityRegistro extends AppCompatActivity {


        //declaraciones
        Spinner interes;
        EditText fecha ;
        EditText fechafin ;
        EditText plazo ;
        EditText monto ;
        TextView paga;
        TextView cuota;
    Date cal = Calendar.getInstance().getTime();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");


    int p = 1;
    int m = 0;
    int in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_registro);

        interes = findViewById(R.id.interes);
        fecha = findViewById(R.id.fecha);
        fechafin = findViewById(R.id.fechafin);
        monto = findViewById(R.id.monto);
        paga = findViewById(R.id.paga);
        cuota = findViewById(R.id.cuota);
        interes = findViewById(R.id.interes);
        plazo = findViewById(R.id.plazo);

        Button btn = findViewById(R.id.fin);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"Gracias",Toast.LENGTH_SHORT).show();
            }
        });


        //usamos la propiedad formatter para poder asiggnar el formato de la fecha el cual recibe un objeto tipo date
        String dt = formatter.format(cal);
        fecha.setText(dt);
        if (plazo.getText().toString().isEmpty()) {

            Calendar calo = Calendar.getInstance();
            calo.setTime(cal);
            calo.add(Calendar.MONTH, 1);
            Date datees = calo.getTime();
            String dto = formatter.format(datees);
            fechafin.setText(dto);
        }


        monto.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().isEmpty()) {
                    m = Integer.parseInt(s.toString());
                    calcular();


                }
                else {
                m =0;
                calcular();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                //confirmar si el plazo esta vacio


            }
        });




        interes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                    in = Integer.parseInt(adapterView.getSelectedItem().toString());
                    calcular();


            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        plazo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().isEmpty())
                {
                    p = Integer.parseInt(s.toString());
                    calcular();
                }
                else
                {
                    p =1;
                    calcular();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }

    public void calcular()
    {

        double a = ((in  * m) / 100)*p;
         double r = m + a;
        double c = r / p;

        String res = String.valueOf(r);
        String reso = String.valueOf(c);
        paga.setText(res);
        cuota.setText(reso);

        Calendar calo = Calendar.getInstance();
        calo.setTime(cal);
        calo.add(Calendar.MONTH,p);
        Date datees = calo.getTime();
        String dto = formatter.format(datees);
        fechafin.setText(dto);


    }
}

