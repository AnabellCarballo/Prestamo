package com.example.prestamo;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class InicioActivity extends AppCompatActivity {
   public TextView historial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        historial  = findViewById(R.id.historial);

    }
    //
    public boolean onCreateOptionsMenu(Menu inicio) {
        getMenuInflater().inflate(R.menu.inicio,inicio); // parametro es el archivo que se creo y donde
        return super.onCreateOptionsMenu(inicio);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {



        switch (item.getItemId())
        {
            case R.id.mnnuevocl:
                Intent intent = new Intent(InicioActivity.this,MainActivity.class);
                startActivityForResult( intent, 4444 );
                break;
            case R.id.mnnuevop:
                Intent intent1 = new Intent(InicioActivity.this,Main2ActivityRegistro.class);
                //intent1.putExtra("res",nombre.getText().toString());
                startActivityForResult( intent1, 4434 );


                break;
            case R.id.mncliente:
                Intent intent2 = new Intent(InicioActivity.this,ClienteActivity.class);
                startActivity(intent2);
                break;
            case R.id.mnprestamo:
                Intent intent3 = new Intent(InicioActivity.this,PrestamoActivity.class);
                startActivity(intent3);
            case R.id.acerca:
                Toast.makeText(this, "Electiva Android", Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode==4444)
        {
            if (resultCode== RESULT_CANCELED)
                Toast.makeText(this, "Cancelo", Toast.LENGTH_SHORT).show();
                //historial.append("Cancelo Ingreso de Nuevo cliente");
            else
                historial.append("Cancelo Ingreso de Nuevo cliente");

        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
